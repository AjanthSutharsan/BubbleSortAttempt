
import java.util.Scanner;
public class EnhancedBubbleSortAttempt
{
    public static void bubbleSort(int[] userArray) {
        boolean trace=true;
        while(trace) {
            trace=false;
            int holder;
            for(int i=0;i<userArray.length-1;i++) {
                if(userArray[i]>userArray[i+1]) {
                    holder=userArray[i];
                    userArray[i]=userArray[i+1];
                    userArray[i+1]=holder;
                    trace=true;
                }
            }
            
            for(int j=0;j<userArray.length;j++) {
                System.out.print(userArray[j]+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many terms do you have in your sequence?");
        int terms = input.nextInt();
        
        int[] userArray = new int[terms];

        for(int i=0;i<terms;i++) {
            System.out.println("Please enter the value at index "+i+" of your set of numbers.");
            userArray[i] = input.nextInt();
        }
        
        bubbleSort(userArray);
    }

}
