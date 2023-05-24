package 학교_자바수업.week12;

public class Student implements Comparable {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void writeInfo() {
        System.out.println(name + " : " + gpa);
    }


//    // 가나다 순서로 정렬
//    public int compareTo(Object obj) {
//        if(obj != null && obj instanceof Student) {
//            Student s = (Student) obj;
//            return this.name.compareTo(s.name);
//        }
//        else
//            return -1;
//    }

    // 성적순 (내림차순으로 정렬)
    public int compareTo(Object obj) {
        if (obj != null && obj instanceof Student){
            Student s = (Student) obj;
            if (gpa > s.gpa)
                return -1;
            else if (gpa < s.gpa)
                return 1;
            else
                return 0;
        }
        else return -1;
    }

    // 오름차순
//    public int compareTo(Object obj) {
//        if (obj != null && obj instanceof Student) {
//            Student s = (Student) obj;
//            if (gpa > s.gpa)
//                return 1;
//            else if (gpa < s.gpa)
//                return -1;
//            else
//                return 0;
//        } else {
//            return -1;
//        }
//    }
}
