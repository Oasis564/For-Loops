import java.util.Scanner;

public class prime {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int number;
        System.out.println("enter a number");
        number = s.nextInt();

        int remainder = number%2;

        if(remainder == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }

    }
}
