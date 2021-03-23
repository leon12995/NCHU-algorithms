
public class HW03_4106029022_5 {
	public  int H_Finding(int[] A) {
		int answer = 0;
		for(int i = 0; i <  A.length -1 ; i++) {
			if(A[i] > A[i+1]) answer = A.length - (i+1);
		}
		return answer - 1;
	};
}
