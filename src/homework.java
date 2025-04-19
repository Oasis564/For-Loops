import java.util.Scanner;

public class homework {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int number;
        System.out.println("enter a number");
        number = s.nextInt();
        int half = number/2;
        int sum = 0;
        for (int i = 1; i <= half; i++) {
            System.out.println(i);
            sum = sum+i;
        }

        System.out.println("the answer is: " + sum);

        if(sum == number){
            System.out.println(sum + " is a perfect number");
        }
        else{System.out.println(sum + " is not a perfect number");}
        


    }
}
