//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape s1;
        // What value can s1 hold?

        // You can not create object for abstract class
        // s1 = new Shape();
        s1 = new Circle("Black", 30.5);

        Shape s2 = new Rectangle("Glod", 20, 25);

        Shape[] shapes = new Shape[2];
        shapes[0] = s1;
        shapes[1] = s2;

        for (Shape sh : shapes) {
            // Shape sh : shapes - tells to provide all the index values inside shapes array one by one until nothing is left
            // Shape sh = s1
            // Shapes sh = s2

            // invoking reference - specific calculateArea()
            // Dynamic method dispatch or Runtime polymorphism
            sh.calculateArea();
        }
        // Can a method be static and abstract at the same time?
        // Can a class be static?
        // Can a class be static and abstract?
        // Can a class be protected and abstract?
    }
}