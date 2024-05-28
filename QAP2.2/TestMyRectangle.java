// QAP 2.2: TestMyRectangle.java
// Joseph Flores
// May 28, 2024

import java.util.Scanner;

public class TestMyRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates of the top-left corner of the rectangle.\n");
        System.out.print("x-coordinate: ");
        int x1 = scanner.nextInt();
        System.out.print("y-coordinate: ");
        int y1 = scanner.nextInt();
        System.out.println("The coordinates of the top-left corner of the rectangle are (" + x1 + ", " + y1 + ")\n\n");

        System.out.print("Enter the coordinates of the bottom-right corner of the rectangle.\n");
        System.out.print("x-coordinate: ");
        int x2 = scanner.nextInt();
        System.out.print("y-coordinate: ");
        int y2 = scanner.nextInt();
        System.out.println("The coordinates of the bottom-right corner of the rectangle are (" + x2 + ", " + y2 + ")\n\n");

        MyRectangle rectangle = new MyRectangle(x1, x2, y1, y2);

        System.out.println("The width of the rectangle is " + rectangle.getWidth());
        System.out.println("The height of the rectangle is " + rectangle.getHeight());
        System.out.println("The area of the rectangle is " + rectangle.getArea());

        scanner.close();
    }
}