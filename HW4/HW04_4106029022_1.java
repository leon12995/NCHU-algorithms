public class HW04_4106029022_1 extends One_0k_rock {
	public boolean [] one0k(String[] str) {	
		boolean outPut [] = new boolean[str.length];
		for(int i = 0; i < str.length ; i++ ) {
			String testNumber;
			testNumber  = str[i]; 
			String [] chaArray;
			chaArray = testNumber.split("");
			int countZero = 0;
			int countOne = 0;
			int lastZero = 0;
			int firstOne = 0;
			boolean hasChosen = false ;
			
			for(int k = 0 ; k < chaArray.length; k++) {
				int charToInt = Integer.parseInt(chaArray[k]);
				if (charToInt ==  0) {
					countZero ++;
					lastZero = k;
				};
				if (charToInt == 1) {
					countOne ++;
					if( hasChosen == false) {
						firstOne = k;
						hasChosen = true;
					}
				};
			};
			
			
			if(countZero != countOne){
				outPut[i] = false;
			}
			else{
				if(lastZero < firstOne) {
					outPut[i] = true;
				}
			};
			
		}
		
		return outPut;
	}
	
	public static void main (String [] args) {
		String [] test = {"0011" ,"00111","01","1100", "1111"};
		HW04_4106029022_1 hw4 = new HW04_4106029022_1();	
		for(int i = 0 ; i < hw4.one0k(test).length; i++) {
			System.out.print(hw4.one0k(test)[i] + ",");
		}
	}
}
