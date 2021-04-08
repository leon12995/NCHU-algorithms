public class HW06_4106029022_1 extends Dessert_Desert {
	public int[] maxBlocks(int[][] inputArr) {
		int [] answer = new int[inputArr.length];
		for(int i = 0; i < inputArr.length; i++) {
			if(inputArr[i].length == 0) answer[i] = 0;
	        int[] maxfromstart=new int[inputArr[i].length];
	        int[] minfromlast=new int[inputArr[i].length];
	        maxfromstart[0]=inputArr[i][0];
	        for(int k=1;k<inputArr[i].length;k++){
	            if(inputArr[i][k]>maxfromstart[k-1]){
	                maxfromstart[k]=inputArr[i][k];
	            }else{
	                maxfromstart[k]=maxfromstart[k-1];
	            }
	        }
	        
	        minfromlast[inputArr[i].length-1]=inputArr[i][inputArr[i].length-1];
	        for(int h=inputArr[i].length-2;h>=0;h--){
	            if(inputArr[i][h]<minfromlast[h+1]){
	                minfromlast[h]=inputArr[i][h];
	            }else{
	                minfromlast[h]=minfromlast[h+1];
	            }
	        }
	        int chunk=1; 
	        for(int q=0;q<inputArr[i].length-1;q++){
	            if(maxfromstart[q]<=minfromlast[q+1]){
	                chunk++;
	            }
	        }
	        
	        answer[i] = chunk;
		}
		
		return answer;
	}
	public static void main(String [] args) {
		int arr[][] = {{ 1, 1, 1, 1, 1 ,1,1},{1,3,5,7,9},{1,2,3},{5,4,3,2,1},{2,1,3,2}};
		HW06_4106029022_1  hw6 =  new HW06_4106029022_1();
		for(int i=0; i<hw6.maxBlocks(arr).length ; i++) {
			System.out.print("/" + hw6.maxBlocks(arr)[i]);
		}
		
		
		
	}
}
