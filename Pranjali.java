package ritesh;

import java.util.Arrays;

public class Pranjali {
	public static void main(String[] args) {
		
		 byte[] arr1 = new byte[4];
		 byte[] arr2 = {1,2,3,4,5,6,7,8};
		 
		 int len = arr2.length-1;
		 
		 for(int i=0; i<arr1.length; i++) {
			 arr1[i] = arr2[len];
			 len--;
		 }
		 System.out.println(Arrays.toString(arr1));
	}
	
}
