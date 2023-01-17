package Bean.exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

// 싱글턴 패턴이 적용된 객체
public class ApplicationContext {
    // 1. 싱글톤 패턴 적용 - 자기 자신을 참조하는 static 필드를 선언한다. 바로 초기화
    // new 로 계속 생성을 못하게 함
    private static ApplicationContext instance = new ApplicationContext();

    // 3. 1.에서 만든 인스턴스를 반환하는 static 메소드를 만든다.
    // 외부에서 사용할 수 있게함
    public static ApplicationContext getInstance() {
        return instance;
    }

    Properties props;
    Map objectMap;

    // 2. 싱글톤 패턴 적용 - 생성자를 private로 바꾼다.
    private ApplicationContext() {
        // 외부에서 new를 못하게 함, 내부에서는 호출 할 수 있음
        props = new Properties();
        // HashMap은 key, value로 된 자료구조
        objectMap = new HashMap<String, Object>();
        try {
            props.load(new FileInputStream("src/Bean/exam/resources/Beans.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String id) throws Exception{

        Object o1 = objectMap.get(id);
        if(o1 == null) {
            String className = props.getProperty(id);
            // class name에 해당하는 문자열을 가지고 인스턴스를 생성할 수 있다.
            Class clazz = Class.forName(className);
            // Class.forName(className)은 CLASSPATH로부터 className에 해당하는 클래스를 찾은 후
            // 그 클래스 정보를 반환한다.
            // System.out.println(clazz.getMethods()); 이러면 배열 값이 나옴
            // 이름을 출력하려면..
//        Method[] methods = clazz.getMethods();
//        for(Method m : methods) {
//            System.out.println(m.getName());
//        }
            // ClassLozder를 이용한 인스턴스 생성. 기본생성자가 있어야한다.
            Object o = clazz.newInstance(); // clazz 정보를 이용해 인스턴스를 생성한다.
            objectMap.put(id, o);
            o1 = objectMap.get(id);
        }
       return o1;
    }
}
