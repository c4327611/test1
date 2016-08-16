package tw.jason;

import  java.io.*;
public class test1 {
	public static void main(String[] args) throws IOException {
		System.out.println("請輸入西元年份");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		 String v1 = br.readLine(); //指定變數v1為使用者輸入值		 
		 int year = Integer.parseInt(v1); //指定變數v1為int型態
		 
		 if (year % 400 ==0) {
			 System.out.println("該年為閏年");
		 } else if (year % 100 == 0) {
			 System.out.println("該年為平年");
		 } else if (year % 4 == 0) {
			 System.out.println("該年為閏年");
		 } else {
			 System.out.println("該年為平年");
		 }		
	}

}
