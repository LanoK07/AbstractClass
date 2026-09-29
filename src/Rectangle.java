public class Rectangle extends Shape{

    double length;

    double width;

    Rectangle(){
        super();
        this.length = 0;
        this.width = 0;
    }

    Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = this.length * this.width;
        System.out.println(" Rectangle area: " +area);
    }
}
