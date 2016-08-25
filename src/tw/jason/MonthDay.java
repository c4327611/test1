package tw.jason;

import javax.swing.JOptionPane;

public class MonthDay {

	public static void main(String[] args) {
		// 輸入日期
		String strYear = 
				JOptionPane.showInputDialog("year");
		String strMonth = 
				JOptionPane.showInputDialog("month");
		int intYear = Integer.parseInt(strYear);
		int intMonth = Integer.parseInt(strMonth);
		System.out.println(intYear + "年/" + intMonth + "月");
		if (intYear>=4000||intMonth>=13){ //判斷是否輸入錯誤
			System.out.println("輸入錯誤");
			
		
		}
		System.out.println("---------------萬年曆------------------");
		System.out.println("日　一　二　三　四　五　六　");
		int chose=0,year=0,month=0,first_day=0,end_day=0;
		//輸出
		
	}
		
			//先判斷閏年及各月天數
	
	static int count_days(int year,int month){
		   int days;
		   if(year<=1752 && year%4==0 && month==2)
		        days=29;
		   else if(year>1752 && ((year%4==0 && year%100!=0)||year%400==0) && month==2)
		        days=29;
		   else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		         days = 31;
		   else if(month==4||month==6||month==9||month==11)
		         days = 30;
		   else
		         days = 28;
		   return(days);}
		   
		//1752年8月以前
		   static int count_first_day(int year,int month){
			   int i,j,f_day=0;
			   if(year<1752 || (year==1752 && month<=8))
			        {       f_day=6;
			                for(i=1;i<year;++i)
			                {       if(i%4==0)
			                        f_day=(f_day+366%7)%7;
			                        else
			                        f_day=(f_day+365%7)%7;
			                }
			                for(j=1;j<month;++j)
			                {       f_day=(f_day+count_days(year,j))%7;
			                }
			        }
			 //1753年後
			   else if(year>1752) 
			        {       f_day=1;
			                for(i=1753;i<year;++i)
			                {    if((i%4==0&&i%100!=0)||i%400==0)
			                     f_day=(f_day+366%7)%7;
			                     else
			                     f_day=(f_day+365%7)%7;
			                }
			                for(j=1;j<month;++j)
			                f_day=(f_day+count_days(year,j))%7;
			        }
			   //1752年10月～12月
			        else if(year==1752 && month>=10) 
			        {       f_day=0;
			                for(j=10;j<month;++j)
			                f_day=(f_day+count_days(year,j))%7;
			        }
			        return(f_day);
			    }
		   
		//1752年9月
		   void special_program()
		   {
		           int counter,days,first_day,end_day;
		           first_day=2;
		           end_day=30;
		           String s="日　一　二　三　四　五　六　\n";
		           for(counter=0;counter<first_day;++counter)
		           s+="\t";
		           for(days=1;days<=end_day;++days){
		             s+=Integer.toString(days)+"\t";
		             if((first_day+days)%7==4&&days!=2)
		                s+="\n";
		             if(days==2)
		                days=13;
		           }
		           
		   }
		
	}

