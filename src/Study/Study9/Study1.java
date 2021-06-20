package src.Study.Study9;

public class Study1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(40, 4);
        System.out.println("The area of the rectangle of length " + rectangle1.length + " and weight " + rectangle1.weight + " is " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle of length " + rectangle1.length + " and weight " + rectangle1.weight + " is " + rectangle1.getPerimeter());

        System.out.println();

        Rectangle rectangle2 = new Rectangle(35.9,3.5);
        System.out.println("The area of the rectangle of length " + rectangle2.length + " and weight " + rectangle2.weight + " is " + rectangle2.getArea());
        System.out.println("The perimeter of the rectangle of length " + rectangle2.length + " and weight " + rectangle2.weight + " is " + rectangle2.getPerimeter());
    }
}