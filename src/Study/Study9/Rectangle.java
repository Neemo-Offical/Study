package src.Study.Study9;

class Rectangle {
    double length = 1;
    double weight = 1;

    Rectangle() {
    }

    Rectangle(double newLength, double newWeight) {
        length = newLength;
        weight = newWeight;
    }

    double getArea() {
        return length * weight;
    }

    double getPerimeter() {
        return (length + weight) * 2;
    }
}
