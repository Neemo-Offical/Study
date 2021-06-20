package src.Study.Study9;

public class Fan {
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