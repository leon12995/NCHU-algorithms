public class HW07_4106029022_2 extends Buy_Phone {
	public int[][] bestPhone(int[][] inputArr) {
		
		 sort(inputArr,0,inputArr.length-1);
		    inputArr = ChangeMaxX(inputArr);
		    inputArr = deletefi(inputArr);
		    return inputArr;
		  }
		  public static int[][] ChangeMaxX(int[][] old){
		    int[][] newarr = new int[old.length][2];
		    int count = 0;
		    for(int i=0;i<old.length;i=i){
		      int numx = old[i][0];
		      int max = old[i][1];
		      while(old[i][0]==numx){
		        if(old[i][1]>=max){
		          max = old[i][1];
		        }
		        i++;
		        if(i>old.length-1){
		          break;
		        }
		      }
		      int[] nn = {numx,max};  
		      newarr[count] = nn;
		      count++;
		    }
		    int[][] newest = new int[count][2];
		    for(int j=0;j<count;j++){
		      newest[j] = newarr[j];
		    }
		    return newest;
		  }
		  public static int[][] deletefi(int[][] old){
		    int[][] newarr = new int[old.length][2];
		    int count = old.length;
		    for(int i=0;i<old.length;i++){
		      for(int j=i+1;j<old.length;j++){
		        if(old[j][1]>=old[i][1]){
		         // System.out.println("dddd");
		          old[i][0]=0;
		          old[i][1]=0;
		          count--;
		          break;
		        }
		      }
		    }
		    int[][] newest = new int[count][2];
		    int cc = 0;
		    for(int k=0;cc<count;k++){
		      //System.out.println(old[k][0]);
		      if(old[k][0]!=0){
		        newest[cc] = old[k];
		        
		        cc++;
		      }
		      //System.out.println(cc);
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
	     int[][] po1 = {{1,10},{2,4},{2,10},{5,4},{4,8},{5,5},{8,4},{10,2},{10,1}};
	     sort(po1,0,po1.length-1);
	     for(int i=0;i<po1.length;i++){
	       System.out.print("{"+po1[i][0]+","+po1[i][1]+"}");
	     }
	     System.out.println("");
	     System.out.println("ChangeMaxX");
	     po1 = ChangeMaxX(po1);
	     for(int i=0;i<po1.length;i++){
	       System.out.print("{"+po1[i][0]+","+po1[i][1]+"}");
	     }
	     System.out.println("");
	     System.out.println("deletefi");
	     po1 = deletefi(po1);
	     for(int i=0;i<po1.length;i++){
	       System.out.print("{"+po1[i][0]+","+po1[i][1]+"}");
	     }
	   }
}
