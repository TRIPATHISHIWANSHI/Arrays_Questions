package array;
//Nth Largest Element in Array
import java.util.Arrays;
import java.util.Scanner;
public class NTH_LARGEST_ELEMENT_IN_ARRAY {

	static int [] ar;
	static Scanner sc=new Scanner(System.in);
	static void scanInput(int capacity) {
		ar=new int[capacity];
		System.out.println("ENTER ELEMENTS OF ARRAY:");
		for(int i=0;i<capacity;i++) {
			ar[i]=sc.nextInt();
		}
	}
	static int printNthLargest(int pos) {
		Arrays.sort(ar);
		if(pos>ar.length) {
			return -1;
		}
		return ar[ar.length-pos];
	}
	public static void main(String[] args) {
		
		System.out.println("ENTER SIZE OF ARRAY:");
		int n=sc.nextInt();
		scanInput(n);
		while(true) {
		System.out.println("WHICH POSITION LARGEST ELEMENT YOU WANT TO FIND:");
		int N=sc.nextInt();
		System.out.println(N+"TH LARGEST ELEMENT IS:"+printNthLargest(N));
		}	
	}
}
