package tw.jason;

import  java.io.*;
public class year1 {
	public static void main(String[] args) throws IOException {
		System.out.print("請輸入西元年份:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		 String v1 = br.readLine(); //指定變數v1為使用者輸入值		 
		 int year = Integer.parseInt(v1); //指定變數v1為int型態
		 
		 if (year % 400 ==0) {
			 System.out.println("西元" + year + "年為閏年");
		 } else if (year % 100 == 0) {
			 System.out.println("西元" + year + "年為平年");
		 } else if (year % 4 == 0) {
			 System.out.println("西元" + year + "年為閏年");
		 } else {
			 System.out.println("西元" + year + "年為平年");
		 }		
	}
}
