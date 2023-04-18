package 학교_자바수업.week4;

public class CourseDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBook("궁극의 자바", "임꺽정");
        Professor prof = new Professor("홍길동", "컴퓨터공학과");
        Course course = new Course("자바프로그래밍", prof, book);
        System.out.println(course.toString());
    }
}
