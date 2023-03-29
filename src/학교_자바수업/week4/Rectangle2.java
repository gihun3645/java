package 학교_자바수업.week4;

public class Rectangle2 {
    public int Width;
    public int Height;

    public int getWidth() {
        return Width;
    }

    public Rectangle2() {
        // 기본 생성자
        // 생성자를 생성하면 기본생성자는 없어짐
    }

    public void setWidth(int width) {
        Width = width;
    }

    public Rectangle2(int Width, int Height) {
        this.Width = Width;
        this.Height = Height;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getArea() {
        return Width*Height;
    }

}
