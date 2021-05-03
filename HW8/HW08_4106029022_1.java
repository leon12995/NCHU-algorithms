public class HW08_4106029022_1 extends Buy_Phone_v2 {
	public int[][] bestPhone(int[][] inputArr){
	    sort(inputArr,0,inputArr.length-1);
	    inputArr = CompareLastNum(inputArr);
	    return inputArr;
	  }

	  public static int[][] CompareLastNum(int[][] old){
	    int[][] newarr = new int[old.length][6];
	    int count = old.length;
	    for(int i=0;i<old.length;i++){
	      for(int j=i+1;j<old.length;j++){
	        if(
	        	old[j][1]>=old[i][1] &&
	            old[j][2]>=old[i][2] && 
	            old[j][3]>=old[i][3] &&
	            old[j][4]>=old[i][4] &&
	            old[j][5]>=old[i][5]
	           ){
	          for(int k=0 ; k<6; k++) {
	        	  old[i][k]=0;
	          }	          	       
	          count--;
	          break;
	        }
	      }
	    }
	    int[][] newest = new int[count][6];
	    int cc = 0;
	    for(int k=0;cc<count;k++){
	      if(
	    	 old[k][0]!=0 && 
	    	 old[k][2]!=0 && 
	    	 old[k][3]!=0 && 
	    	 old[k][4]!=0 && 
	    	 old[k][5]!=0
	    	 ){
	        newest[cc] = old[k];
	        cc++;
	      }
	    }
	    return newest;
	  }
	  private static void sort(int[][] number, int left, int right) {
	    if(left < right) { 
	      int q = partition(number, left, right); 
	      sort(number, left, q-1); 
	      sort(number, q+1, right); 
	    } 
	    
	  }
	  
	  private static int partition(int number[][], int left, int right) {  
	    int i = left - 1; 
	    for(int j = left; j < right; j++) { 
	      if(number[j][0] <= number[right][0]) { 
	        i++; 
	        swap(number, i, j); 
	      } 
	    } 
	    swap(number, i+1, right); 
	    return i+1; 
	  } 
	  private static void swap(int[][] number, int i, int j) {
	    int[] t = number[i]; 
	    number[i] = number[j]; 
	    number[j] = t;
	  }
		   public static void main(String[] args){  
		     int[][] po1 = {{8,7,7,4,2,1},{2,4,4,6,2,1},{4,0,5,1,3,2},{5,2,4,3,7,3},{7,5,6,9,8,9}};
		     sort(po1,0,po1.length-1);
		     po1 = CompareLastNum(po1);
		     for(int i=0;i<po1.length;i++){
		       System.out.print("{"+po1[i][0]+ "," + po1[i][1] +"," + po1[i][2]+","+po1[i][3] + "," + po1[i][4]+","+po1[i][5] + "}");
		     }
		   }
}
