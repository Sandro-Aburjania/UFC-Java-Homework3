package ge.ufc.homework3.rectangle;

public class Rectangle {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //პერიმეტრის გამოთვლა
    private int getPerimeter() {
        return 2 * (length + width);
    }

    //ფართობის გამოთვლა
    private int getArea() {
        return length * width;
    }

    //ფართობების შედარება
    public int compareAreas(Rectangle other) {
        if (this.getArea() > other.getArea()) {
            return 1;
        }else if (this.getArea() == other.getArea()) {
            return 0;
        }else{
            return -1;
        }

    }
}
