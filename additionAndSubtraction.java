package array;
import java.util.*;
public class additionAndSubtraction {
	    public static void main(String[] args) {
	        int[] array1 = {1,4, 2, 3, 4};
	        int[] array2 = {5, 6, 7, 8};
	        
	        int[] resultArray = new int[array1.length];
	        
	        // Addition
	        for (int i = 0; i < array1.length; i++) {
	            resultArray[i] = array1[i] + array2[i];
	        }
	        
	        System.out.println("Addition Result:");
	        printArray(resultArray);
	        
	        // Subtraction
	        for (int i = 0; i < array1.length; i++) {
	            resultArray[i] = array1[i] - array2[i];
	        }
	        
	        System.out.println("Subtraction Result:");
	        printArray(resultArray);
	    }
	    
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}

