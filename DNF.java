public class DNF {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;
        System.out.print("Before: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int low = 0, mid = 0, high = n - 1;
        int temp = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.print("\nAfter: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
