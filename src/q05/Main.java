import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                double r = sc.nextDouble();
                System.out.println("Area = " + (Math.PI * r * r));
                break;

            case 2:
                int l = sc.nextInt(), b = sc.nextInt();
                System.out.println("Area = " + (l * b));
                break;

            case 3:
                int base = sc.nextInt(), h = sc.nextInt();
                System.out.println("Area = " + (0.5 * base * h));
                break;
        }
    }
}