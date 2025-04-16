import java.util.Scanner;

public class rows {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int rows;
        System.out.println("enter the amount of rows");
        rows = s.nextInt();

        for(int r = 1; r<=rows; r++){
            for(int c = 1; c<=r; c++){
                System.out.print(" * ");
            }
            System.out.println();
        }









    }
    
}
