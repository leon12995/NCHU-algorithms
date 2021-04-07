public class HW05_4106029022_1 extends LLK {
	public boolean checkLLK(int [][] array) {
		boolean answer =false;
		for(int i = 0 ; i < array.length - 2; i++) {
			int point1X = array[i][0];
			int point1Y = array[i][1];
			for(int j = i + 1 ; j < array.length - 1 ; j++) {
				int point2X = array[j][0];
				int point2Y = array[j][1];
				for(int k = i + 2; k < array.length; k++){
					int point3X = array[k][0];
					int point3Y = array[k][1];
					int dx1 = point1X -point2X;
					int dy1 = point1Y -point2Y;
					int dx2 = point1X -point3X;
					int dy2 = point1Y -point3Y;
					int cross = dx1*dy2 - dx2*dy1;
					if(cross == 0) answer = true;
				}
			}
		}
		return  answer;

		
	};
	public static void main (String [] args) {
		int [][] test = {{1,1},{-2,-2},{0,0}};
		HW05_4106029022_1 hw5 = new HW05_4106029022_1();
		hw5.checkLLK(test);
		System.out.println(hw5.checkLLK(test));
		
	}
}
