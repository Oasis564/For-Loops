import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = s.nextInt();
        int fact = 1;


        for(int i=1; i <= number; i++){
            fact = fact * i;
        }

        System.out.println(number+"! is: "+fact);



    }
}
