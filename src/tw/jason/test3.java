package tw.jason;
import java.io.*;
public class test3 {

	public static void main(String[] args) throws IOException {
		// 3.7-4 
		
		System.out.println("請輸入身高和體重:");
		BufferedReader bo = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String h1 = bo.readLine();
		String w1 = bo.readLine();
		
		double h2 = Double.parseDouble(h1);
		double w2 = Double.parseDouble(w1);
		System.out.println("您的身高是" + h2 + "公分 。");
		System.out.println("您的體重是" + w2 + "公斤。");
		double h3 = h2/100;
		
		double bmi = (w2/(h3*h3));
		System.out.println("您的BMI值為:" + bmi);
		
	}

}
