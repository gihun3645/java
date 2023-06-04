//package com.study.java.exam;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//
//public class ApplicationContext {
//	// 1. 싱글턴 패턴 적용 - 자기 자신을 참조하는 static한 필드를 선언한다.
//	private static ApplicationContext instance = new ApplicationContext();
//
//	// 3. 1.에서 만든 인스턴스를 반환하는 static 메서드를 만든다.
//	public static ApplicationContext getInstance() {
//		return instance;
//	}
//
//    private Properties props;
//    private Map objectMap;
//
//    // 2. 싱글턴 패턴 적용 - 생성자를 private로 바꾼다.
//    private ApplicationContext() {
//        props = new Properties();
//        objectMap = new HashMap<String, Object>();
//        try {
//            props.load(new FileInputStream("src/main/java/com/study/java/exam/resources/Beans.property"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public Object getBean(String id) throws Exception{
//
//
//    	// 같은 값을 가져오는 법 (싱글턴 리턴)
//    	Object o1 =  objectMap.get(id);
//    	if(o1 == null) {
//        String className = props.getProperty(id);
//        // class name에 해당하는 문자열을 가지고 인스턴스를 생성할 수 있다.
//        // Class.forName은 CLASSPATH로 부터 className에 해당하는 클래스를 찾은 후
//        // 그 클래스 정보를 반환한다.
//        Class clazz = Class.forName(className);
////        Method[] methods = clazz.getMethods();
////        for(Method m : methods) {
////        	System.out.println(m.getName());
////        }
//        Object o = clazz.newInstance(); // clazz에 해당하는 클래스의 인스턴스를 생성한다.
//        objectMap.put(id, o);
//        o1 = objectMap.get(id);
//    	}
//        return o1;
//    }
//}
