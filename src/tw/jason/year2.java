package tw.jason;

import java.util.Scanner;

public class year2 {
public static void main(String[] args) {
	System.out.print("請輸入西元年份:");
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	int year = scanner.nextInt();
	
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