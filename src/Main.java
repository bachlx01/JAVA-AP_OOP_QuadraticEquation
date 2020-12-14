import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic equation solution");
        System.out.println("Enter parameters a, b, c");
        System.out.print("a= ");
        Double a = input.nextDouble();
        System.out.print("b= ");
        Double b = input.nextDouble();
        System.out.print("c= ");
        Double c = input.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);

        System.out.println(quadratic.getDelta());

        if (quadratic.getDelta() <0 ){
            System.out.println("No solution");
        } else {
            System.out.println("There are two root:\n x1 = "+ quadratic.getRoot1()+ "; x2 = " + quadratic.getRoot2());
        }

    }
}
