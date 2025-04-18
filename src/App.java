public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        //we use for loops when we know how many times we have to repeat.
        for(int i = 1; i<=100; i++){
            sum = sum+i;
            
        }

        System.out.println("for loop: sum of first hundred numbers is: " + sum);
        
        int counter = 0;
        sum = 0;
        //we use while loops when we dont know how many times to repeat but we know that there is a condition until we have to repeat.
        while(counter<100){
            counter++;
            sum = sum + counter;
        }

        System.out.println("while loop: sum of first hundred numbers is: " + sum);
    }
}
