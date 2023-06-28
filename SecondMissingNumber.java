import java.util.Arrays;

public class SecondMissingNumber {

	private static int missing(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i =0;i<n-2;i++) {
			if(arr[i]==i+1)continue;
			else if(arr[i]==i+2)continue;
			else return i+2;
		}
		return n;
	}
	public static void main(String[] args) {
		int n = 9;
		int arr[] = {1,4,2,9,6,5,7};
		System.out.println("Second Missing number : "+missing(arr,n ));
	}

}
