package baseStudy;
/*
 输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如:153= 1*1*1+3*3*3+5*5*5
 */
public class shuixianhua {

	public static void main(String[] args) {
		for(int i =100;i<=999;i++) {
			int a = i / 100;//百位
			int b = i % 100 /10;//十位
			int c = i % 10;//个位
			if (i == (a*a*a+b*b*b+c*c*c)) {
				System.out.println(i);
			}
		}

	}

}
