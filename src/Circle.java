
// If a class inherit an abstract class then the subclass/base class must have to provide definition of the
// inherited abstract method

public class Circle extends Shape {
    double radius;

    Circle(){
        //this.color = "";
        super();
        this.radius = 0;
    }

    Circle(String color, double radius){
       // this.color = color;
        super(color);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = 3.142 * this.radius * this.radius;
        System.out.println(" Circle area: " + area);

    }
}
