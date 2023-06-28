package array;
import java.util.*;
public class Sort0and1 {

	static int[] arr;
	static Scanner sc=new Scanner(System.in);
	static void fillArray(int capacity) {
		arr=new int[capacity];
		System.out.println("ENTER ARRAY ELEMENTS IN 0'S AND 1'S");
		for(int i=0;i<capacity;i++) {
			arr[i]=sc.nextInt();
		}
	}
	static void sort0and1() {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		for(int i=count;i<arr.length;i++) {
			arr[i]=1;
		}
		System.out.println("SORTED ARRAY IS:");
		printArray();
	}
	static void printArray() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" element="+arr[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("ENTER ARRAY LENGTH:");
		int capacity=sc.nextInt();
		fillArray(capacity);
		sort0and1();

	}

}
