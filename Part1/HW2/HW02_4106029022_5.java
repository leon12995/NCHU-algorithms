
public class HW02_4106029022_5 extends ThreeSum{
public static void main (String []args) {
		int [] A = {-1,1,2,4,8,-3};
		HW02_4106029022_5 hw2 = new HW02_4106029022_5();
		System.out.println(hw2.T_sum(A));
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
	public int T_sum(int[] array) {
		int Sum0Count = 0;
	    int N = array.length;
	    sort(array,0,N-1);
		for(int i = 0; i < array.length; i++) {
			int target  = -array[i];
			int left = i + 1;
			int right = array.length - 1;
			while(left < right) {
				int sumTwo = array[left] + array[right];
				if(sumTwo == target) {
					Sum0Count++;
					left++;
					right--;	
				}else if(sumTwo < target) {
					left++;
				}else {
					right--;
				}
			}	
		}
		return Sum0Count;
	};
}
