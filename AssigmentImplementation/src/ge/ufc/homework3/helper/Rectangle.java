package ge.ufc.homework3.helper;

public class Rectangle {
    private int length;
    private int width;

    public void setLength(int l){
        length = l;
    }
    public void setWidth(int w){
        width = w;
    }

    //პერიმეტრის გამოთვლის გამოძახება თუ მოგვინდა, შევძლებთ მხოლოდ ამ პაკეტში ან ამ კლასის შვილობილ კლასში.
    protected int getPerimeter(){
        return 2 * (this.length + this.width);
    }

    //პერიმეტრების შედარება
    public int comparePerimeters(Rectangle rec1, Rectangle rec2){
        if(rec1.getPerimeter() > rec2.getPerimeter()){
            return 1;
        }else if(rec1.getPerimeter() == rec2.getPerimeter()){
            return 0;
        }
        else{
            return -1;
        }

    }

}
