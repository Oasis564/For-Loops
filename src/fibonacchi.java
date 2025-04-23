import java.util.Scanner;

public class fibonacchi {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int count, num1 = 0, num2 = 1;
        count = s.nextInt();
        System.out.println("Fibonacci Series of "+count+" numbers:");
        int i = 1;
        int sumOfF = 0;

        while(i<=count){
            System.out.println(num1+" ");
            sumOfF = sumOfF + num1;
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
            
        }

       
        System.out.println(":the sum of all these numbers are "+sumOfF);


        
        

    }
}
