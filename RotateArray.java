class Solution {
    private void reverse(int []arr,int low, int high) {
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
  
    public void rotate(int[] a, int rotation) { 
      int n = a.length;
      rotation=rotation%n;
      if(n==1 || rotation ==0 || rotation==n)return;
      reverse(a,0,n-rotation-1);
	    reverse(a,n-rotation,n-1);
	    reverse(a,0,n-1);
    }
}
