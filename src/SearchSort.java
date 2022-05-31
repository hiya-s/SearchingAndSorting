import java.util.Arrays;
import java.util.Random;

public class SearchSort {

	private int[] nums;
	
	public SearchSort(int[] numbs) {
		nums = numbs;
	}
	public SearchSort(int size) {
		nums = new int[size];
		initArray();
	}
	public void initArray() {
		Random random = new Random();
		for(int i = 0; i < nums.length; i++ ) {
			nums[i] = random.nextInt(1000);
		}
	}
	public int linearSearch(int key) {
		for(int i = 0; i < nums.length; i++ ) {
			if(nums[i] == key) {
				return i;
			}
		}
		return -1;
	}
	

	public int linearSearchRecur(int key) {
	return linearSearchRecur(key, 0);
	
}
	
	private int linearSearchRecur(int key, int index) {
		if(index < nums.length) {
		if(nums[index] == key) {
			return index;
		}
		
		else {
		return linearSearchRecur(key, index+1);	
		}
		}
		else {
		return -1;
		}
		}
	public int binarySearch(int key) {
		Arrays.sort(nums);
		
		if(key > nums[nums.length / 2]) {
			int l = nums.length;
			int i = 0;
			while(key != nums[i]) {
				if(key > nums [(nums.length/2 + (nums.length / 2)/ 2)]) {
					
				}
			}
		}
		
		
		
	}
	
	public int binarySearchRecursive(int key) {
		
		        if (nums[nums.length/2] == key)
		            return nums.length/2;
		 
		        // If element is smaller than mid, then
		        // it can only be present in left subarray
		        if (nums[nums.length/2] > key)
		            return binarySearch1( 0, nums.length/2 - 1, key);
		 
		        // Else the element can only be present
		        // in right subarray
		        return binarySearch1( nums.length/2 + 1, nums.length, key);
		    }
	
	
	private int binarySearch1(int low, int h, int key ) {
		if (h >= low) {
	        int mid = low + (h - low) / 2;
	 
	        if (nums[mid] == key)
	            return mid;
	 
	        if (nums[mid] > key)
	            return binarySearch1(low , mid - 1, key);
	 
	        return binarySearch1( mid + 1, h, key);
	    }
	 
	    return -1;
	}
	
	
	//4
	public void bubbleSort(boolean print) {
		int rn = 0;
		
		/* if(print == true) {
			while(rn != nums.length) {
			int max = 0;
			for(int a = 0; a < nums.length; a++) {
				System.out.println(nums[a]);
			}
		for(int i = 0; i < nums.length; i++ ) {
			if(nums[i] > nums[max]) {
				max = i;
			}
		}
		nums[rn] = nums[max];
			}
		
		}
		*/
	
		
		if(print == true) {
			for(int i = 0; i < nums.length - 1; i++) {
				for(int j = 0; j < nums.length -1; j++) {
					
					//print first
					System.out.print("(");
					for(int b : nums) {
						System.out.print(b + " ");
					}
					System.out.println(")");
					
					if(nums[j + 1] < nums[j]) {
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
					//print second
					System.out.print("(");
					for(int a : nums) {
						System.out.print(a + " ");
					}
					System.out.println(")");
					
				}
			}
		}
		else {
			for(int i = 0; i < nums.length - 1; i++) {
				for(int j = 0; j < nums.length -1; j++) {
					
					
					if(nums[j + 1] < nums[j]) {
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
					
					
				}
			}
		}
	}
	
	//5 riddle
	
	//6
	public void selectionSort(boolean print) {
		if(print == true) {
			for(int i = 0; i < nums.length - 1; i++) {
				int min = 1000000;
				for(int j = 0; j < nums.length -1; j++) {
					
					
					//print first
					System.out.print("(");
					for(int b : nums) {
						System.out.print(b + " ");
					}
					System.out.println(")");
					
					if(nums[j + 1] < nums[j]) {
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
					//print second
					System.out.print("(");
					for(int a : nums) {
						System.out.print(a + " ");
					}
					System.out.println(")");
					
				}
			}
		}
		else {
			for(int i = 0; i < nums.length - 1; i++) {
				for(int j = 0; j < nums.length -1; j++) {
					
					
					if(nums[j + 1] < nums[j]) {
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
					
					
				}
			}
		}
		
	}
	
	//7
	public void insertionSort(boolean print) {

		 for( int i = 1 ; i < nums.length ; i++) 
		 { 
		 int x = nums[i] ; 
		 int j = i -1 ; 
		 while(j >= 0 && x < nums[j]) 
		 { 
		 nums[j + 1] = nums[j] ; 
		 j-- ; 
		 } 
		 nums[j+ 1 ] = x ; 
		 print = true ; 
		 } 

	}
	
	//8
	public void mergeSort(int[] array, int low, int mid, int high, boolean print)    {

		if(print == true) {
		 int leftArray[] = new int[mid - low + 1]; 
		 int rightArray[] = new int[high - mid]; 
		 for (int i = 0; i < leftArray.length; i++) 
		 leftArray[i] = array[low + i]; 
		 for (int i = 0; i < rightArray.length; i++) 
		 rightArray[i] = array[mid + i + 1]; 
		  
		 int leftValue = 0; 
		 int rightValue = 0;
		  
		 for (int i = low; i < high + 1; i++)  
		 { 
		 if (leftValue < leftArray.length && rightValue <  rightArray.length)  
		 { 
		 if (leftArray[leftValue] < rightArray[rightValue])   { 
		 array[i] = leftArray[leftValue]; 
		 leftValue++; 
		 } else { 
		 array[i] = rightArray[rightValue]; 
		 rightValue++; 
		 } 
		 } else if (leftValue < leftArray.length)  
		 { 
		  
		 array[i] = leftArray[leftValue]; 
		 leftValue++; 
		 } else if (rightValue < rightArray.length)  
		 { 
		  
		 array[i] = rightArray[rightValue]; 
		 rightValue++; 
		 } 
		 } 
		} 
	}

	}
	
	
	
	
	}
  

