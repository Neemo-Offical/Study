package src.Study.Study9;

public class Study8 {
    public static void main(String[] args) throws InterruptedException {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setPower(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setPower(false);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
