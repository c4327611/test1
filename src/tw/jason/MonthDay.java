package tw.jason;

import javax.swing.JOptionPane;

public class MonthDay {

	public static void main(String[] args) {
		// 輸入日期
//		String strYear = 
//				JOptionPane.showInputDialog("year");
//		String strMonth = 
//				JOptionPane.showInputDialog("month");
//		int intYear = Integer.parseInt(strYear);
//		int intMonth = Integer.parseInt(strMonth);
//		System.out.println(intYear + "年/" + intMonth + "月");
//		if (intYear>=4000||intMonth>=13){ //判斷使否輸入錯誤時間
//			System.out.println("輸入錯誤");
		
//		}
		System.out.println("Su Mo Tu We Th Fr Sa");
		
			//西元1/1/1~1752/9/2
	int[] Month = {1,2,3,4,5,6,7,8,9,10,11,12}; //fix
	Month[0] = Month[2] = Month[4] = Month[6] = Month[7] = Month[9] = Month[11] = 31;
	Month[3] = Month[5] = Month[8] = Month[10] = 30;
	//System.out.println(Month[0]);
	
	int intYear = 2016;
	int intMonth = 8;
	
	if (intYear % 400 == 0) {  
			Month[1] = 29;
		 } else if (intYear % 100 == 0) {
			 Month[1] = 28;
		 } else if (intYear % 4 == 0) {
			 Month[1] = 29;
		 } else {
			 Month[1] = 28;
		 }
		System.out.println();
		
		
		//西元1752/9/14~1911/12/18
		
		
		//1912/1/1~3999/12/31
		
		
	}

}
