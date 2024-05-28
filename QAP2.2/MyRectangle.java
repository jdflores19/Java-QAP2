// QAP 2.2: MyRectangle.java
// Joseph Flores
// May 28, 2024

public class MyRectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Constructor 
    public MyRectangle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Computing the width of the rectangle by getting the absolute value of the difference between x1 and x2
    public int getWidth() {
        return Math.abs(x1 - x2);
    }

    // Computing the height of the rectangle by getting the absolute value of the difference between y1 and y2
    public int getHeight() {
        return Math.abs(y1 - y2);
    }

    // Compute the area of the rectangle by multiplying the width and height     
    public int getArea() {
        return getWidth() * getHeight();
    }
}