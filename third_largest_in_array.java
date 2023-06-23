package array;
//Third Largest in Array find out
import java.util.Scanner;

public class third_largest_in_array {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.println("ENTER SIZE OF ARRAY:");
       int n=sc.nextInt();
       System.out.println("ENTER ELEMENTS OF ARRAY:");
       int []arr=new int[n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
        // First Largest
        int firstLargest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest=Integer.MIN_VALUE;
        if(arr.length<3){
            System.out.println("Small Array...");
            return ;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>firstLargest){
                thirdLargest=secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            if(arr[i]>secondLargest && arr[i]!=firstLargest) {
            	secondLargest=arr[i];
            }
            else if(arr[i]>thirdLargest && arr[i]!=secondLargest && arr[i]!=firstLargest){
                thirdLargest = arr[i];
            }
        }
        System.out.println("FIRST_LARGEST="+firstLargest+ "\nSECOND LARGEST= "+secondLargest+"\nTHIRD LARGEST= "+thirdLargest);
    }
}
