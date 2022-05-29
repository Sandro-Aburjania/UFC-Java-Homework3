package ge.ufc.homework3.main;
import ge.ufc.homework3.rectangle.Rectangle;

public class Main{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.setLength(15);
        r1.setWidth(12);

        Rectangle r2 = new Rectangle();
        r2.setLength(11);
        r2.setWidth(5);

        ge.ufc.homework3.helper.Rectangle r3 = new ge.ufc.homework3.helper.Rectangle();
        r3.setLength(23);
        r3.setWidth(16);

        ge.ufc.homework3.helper.Rectangle r4 = new ge.ufc.homework3.helper.Rectangle();
        r4.setLength(23);
        r4.setWidth(16);

        System.out.println("ფართობების შედარება: " + r1.compareAreas(r2));
        System.out.println("პერიმეტრების შედარება: " + r3.comparePerimeters(r3, r4));
    }
}
