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

    public static class Fan {
        final static int SLOW = 1,MEDIUM = 2,FAST = 3;
        private int speed = SLOW;
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int newSpeed) {
            speed = newSpeed;
        }

        private boolean power = true;
        public boolean getPower() {
            return power;
        }
        public void setPower(boolean newPower) {
            power = newPower;
        }

        private double radius = 5;
        public double getRadius() {
            return radius;
        }
        public void setRadius(double newRadius) {
            radius = newRadius;
        }

        String color = "blue";
        public String getColor() {
            return color;
        }
        public void  setColor(String newColor) {
            color = newColor;
        }

        Fan() {
        }

        public String toString() {
            if (power) {
                return "Speed of the fan is " + getSpeed() + ", color is " + getColor() + " and the radius is " + getRadius();
            }
            else {
                return "The fan is off. Color of the fan is " + getColor() + " and the radius is " + getRadius();
            }
        }
    }
}
