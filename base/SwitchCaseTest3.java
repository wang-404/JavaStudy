package baseStudy;

/*
 从键盘分别输入年、月、日，判断这一天是当年的第几天
 判断闰年
 可以被4整除，但不可以被400整除或者可以被400整除
 */
import java.util.Scanner;
public class SwitchCaseTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scan.nextInt();
		System.out.println("请输入月份");
		int month = scan.nextInt();
		System.out.println("请输入日期");
		int day = scan.nextInt();
		
		//定义一个变量保存天数
		int sumDays = 0;		
		switch (month) {
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			if ((year % 4 == 0 && year % 100 !=0)||year % 400 == 0) {
				sumDays += 29;
			}else {
				sumDays += 28;
			}
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}
		System.out.println(sumDays+"天");

	}

}
