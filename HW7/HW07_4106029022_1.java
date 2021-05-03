public class HW07_4106029022_1 extends Buy_Phone{
	public int[][] bestPhone(int[][] inputArr){
		int WorstPhone [][] = new int [inputArr.length][2];
		int WorstPhoneLength = 0;
			
		sort(inputArr,0,inputArr.length-1 );
		
		if(inputArr[inputArr.length - 2][0] == inputArr[inputArr.length -1][0] && 
				   inputArr[inputArr.length -1][1] < inputArr[inputArr.length - 2][1]) {
			WorstPhone[inputArr.length-1][0] = inputArr[inputArr.length-1][0];
			WorstPhone[inputArr.length-1][1] = inputArr[inputArr.length-1][1];
			WorstPhoneLength++;
		}
		
		
		for(int i = 0 ; i < inputArr.length ; i++) {
			for(int j = i + 1; j < inputArr.length; j++) {
				if(inputArr[i][1]  <= inputArr[j][1]) {
					WorstPhone[i][0] = inputArr[i][0];
					WorstPhone[i][1] = inputArr[i][1];
					WorstPhoneLength++;
					break;		
				};	
			};
		}
			
		int BestPhoneLength = inputArr.length - WorstPhoneLength ;
		int BestPhone [][] = new int [BestPhoneLength][2];
		
		for(int i=0; i < inputArr.length ; i++) {			
			for(int j=0 ;j< inputArr.length; j++) {
				if(inputArr[i][0] == WorstPhone[j][0] && inputArr[i][1] == WorstPhone[j][1]) {
					inputArr[i][0] = 0;
					inputArr[i][1] = 0;
				};
			};
		}
		
		int k = 0;
		
		for(int i = 0 ; i <inputArr.length; i++ ) {
			if(inputArr[i][0] != 0 && inputArr[i][1] != 0) {		
				BestPhone[k][0] =inputArr[i][0];
				BestPhone[k][1] = inputArr[i][1];
				k++;
			};
			
		};
	
		return BestPhone;
		
	};
	
	public static void sort(int[][] number, int left, int right) {
	    if(left < right) { 
	      int q = partition(number, left, right); 
	      sort(number, left, q-1); 
	      sort(number, q+1, right); 
	    } 
	    
	  };
	  
	  public static int partition(int number[][], int left, int right) {  
	    int i = left - 1; 
	    for(int j = left; j < right; j++) { 
	      if(number[j][0] <= number[right][0]) { 
	        i++; 
	        swap(number, i, j); 
	      } 
	    } 
	    swap(number, i+1, right); 
	    return i+1; 
	  }; 
	  
	  public static void swap(int[][] number, int i, int j) {
	    int t = number[i][0]; 
	    number[i][0] = number[j][0]; 
	    number[j][0] = t;
	    int k = number[i][1]; 
	    number[i][1] = number[j][1]; 
	    number[j][1] = k;
	  };

	  public static void main(String [] args) {
		  int [][] test = {{1,1},{2,4},{2,10},{5,4},{4,8},{5,5},{8,4},{10,2},{10,1}}; 
		  HW07_4106029022_1 hw7 = new HW07_4106029022_1() ;
		  for(int i=0; i<hw7.bestPhone(test).length ; i++) {
			  System.out.print("{" +hw7.bestPhone(test)[i][0] + ", " + hw7.bestPhone(test)[i][1] + "}" );
		  }
		  System.out.println(hw7.bestPhone(test).length);
	  };
}