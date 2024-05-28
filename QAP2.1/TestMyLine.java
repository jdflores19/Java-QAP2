// QAP 2.1: TestMyLine Class
// Joseph Flores
// May 28, 2024

import java.util.Scanner;

public class TestMyLine {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X1 coordinate for start point: ");
        int X1 = scanner.nextInt();

        System.out.print("Enter Y1 coordinate for start point: ");
        int Y1 = scanner.nextInt();

        System.out.print("Enter X2 coordinate for end point: ");
        int X2 = scanner.nextInt();

        System.out.print("Enter Y2 coordinate for end point: ");
        int Y2 = scanner.nextInt();

        MyPoint startPoint = new MyPoint(X1, Y1);
        MyPoint endPoint = new MyPoint(X2, Y2);

        MyLine line = new MyLine(startPoint, endPoint);

        System.out.println("The length of the line is " + line.getLength());    
        System.out.println("The gradient of the line is " + line.getGradient());
        System.out.println(line.toString());

        scanner.close();
    }
}
