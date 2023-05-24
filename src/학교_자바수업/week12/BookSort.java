package 학교_자바수업.week12;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class BookSort {
    public static void main(String[] args) {
        Book[] list = new Book[4];
        list[0] = new Book("자바 프로그래밍", 28000);
        list[1] = new Book("인류의 대향해", 21600);
        list[2] = new Book("장사란 무엇인가", 12000);
        list[3] = new Book("상처받지 않은 영혼", 24000);

        Arrays.sort(list);
        for (Book b : list)
            System.out.println(b);
    }
}
class Book implements Comparable{
        private String title;
        private int price;

        public Book(String title, int price) {
            this.title = title;
            this.price = price;
        }

        public String toString() {
            return  "제목="+title+", "+"가격="+price+"원";
        }

        @Override
        public int compareTo(Object obj) {
            if(obj != null && obj instanceof Book) {
                Book b = (Book) obj;
                if (price > b.price)
                    return 1;
                else if (price < b.price)
                    return -1;
                else
                    return 0;
            }
            else
                return -1;
        }
    }


