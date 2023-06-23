package array;
/*Convert Array into Zig Zag Array

arr [] ={4,3,7,8,6,2,1}
output : {3,7,4,8,2,6,1}
first<second>third and so on.
  */
import java.util.Scanner;

public class ZIG_ZAG_ARRAY {

	static int [] a;
	static Scanner sc=new Scanner(System.in);
	static void scanInput(int capacity) {
		a=new int[capacity];
		System.out.println("ENTER ELEMENTS OF ARRAY:");
		for(int i=0;i<capacity;i++) {
			a[i]=sc.nextInt();
		}
	}
	static int[] zig_zag_array(int start,int end) {
		if(start==end-1) {
			return a;
		}
		int mid;
		
		if(a[start]>a[start+1]) {
			mid=a[start];
			a[start]=a[start+1];
			a[start+1]=mid;
					
		}
		if(a[start+1]<a[start+2]) {
			mid=a[start+1];
			a[start+1]=a[start+2];
			a[start+2]=mid;
					
		}
		return zig_zag_array(start+2,end);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("ENTER SIZE OF ARRAY:");
		int n=sc.nextInt();
		scanInput(n);
		zig_zag_array(0,n);
		System.out.println("ARRAY AFTER ZIG-ZAG:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
