import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num = 28;

        // Prime check
        boolean isPrime = true;
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        // Perfect check
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num % i == 0)
                sum += i;
        }

        System.out.println("Prime: " + isPrime);
        System.out.println("Perfect: " + (sum == num));
    }
}