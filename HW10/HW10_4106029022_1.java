
public class HW10_4106029022_1 extends SortingArray {
	public int [] sorting(int[]A) {
		sort(A,0,A.length-1);
		return A;
	}
	
	private static void sort(int[] number, int left, int right) {
	    if(left < right) { 
	      int q = partition(number, left, right); 
	      sort(number, left, q-1); 
	      sort(number, q+1, right); 
	    } 
	    
	  }
	  
	  private static int partition(int number[], int left, int right) {  
	    int i = left - 1; 
	    for(int j = left; j < right; j++) { 
	      if(number[j] <= number[right]) { 
	        i++; 
	        swap(number, i, j); 
	      } 
	    } 
	    swap(number, i+1, right); 
	    return i+1; 
	  } 
	  
	  private static void swap(int[] number, int i, int j) {
	    int t = number[i]; 
	    number[i] = number[j]; 
	    number[j] = t;
	  }
	  
	  public static void main(String args []) {
		  int[] input = {-1,2,5,9,8,7,1,3,2};
		  HW10_4106029022_1 hw = new HW10_4106029022_1();
		  hw.sorting(input);
		  for(int i = 0; i< input.length; i++) {
			  System.out.print(input[i] + ",");
			 
		  }
		  
	  }
}
