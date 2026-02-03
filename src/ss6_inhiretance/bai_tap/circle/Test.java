package ss6_inhiretance.bai_tap.circle;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        c.setColor("red");
        System.out.println(c);

        Cylinder cylinder = new Cylinder(5,10,"yellow");
        System.out.println(cylinder);

        cylinder.setColor("green");
        cylinder.setHeight(15);
        System.out.println("Sau khi đổi chiều cao và màu sắc");
        System.out.println(cylinder);
    }
}
