
public class HW01_4106029022_1 extends ArrayData{
	
	public HW01_4106029022_1 (int[] A ) {
		this.A = A;
	}
	
	public static void main (String[] args) {
		int[] A = { 1, 2 , 3};
		HW01_4106029022_1 test = new HW01_4106029022_1(A);
		System.out.println(test.min());
		System.out.println(test.max());
	}
	
	public int max() {
		int MaxValue = A[0];
		for(int i=1 ; i < A.length ; i++) {
			if( MaxValue < A[i] ) {
				MaxValue = A[i];
			}
		}
		return MaxValue;
	}
	public int min() {
		int MinValue = A[0];
		for(int i=1; i < A.length ; i++) {
			if( MinValue > A[i]) {
				MinValue =  A[i];
			}
		}
		return MinValue;
	}
}
