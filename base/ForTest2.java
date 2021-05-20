package baseStudy;
/*
 题目:输入两个正整数m和n，求其最大公约数和最小公倍数。比如:12和120的最大公约数是4，最小公倍数是60。
break关键字使用
 */
import java.util.Scanner;
public class ForTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入第一个正整数");
		int m = scan.nextInt();
		System.out.print("请输入第二个正整数");
		int n = scan.nextInt();
		//获取最大公约数
		//获取两个数中的较小值
		int min = (m <= n)?m:n;
		//遍历
		for(int i = min;i>=1;i--) {
			if (m % i ==0 && n % i==0) {
				System.out.println("最大公约数为"+i);
				break;//循环中执行到 break跳出循环
			}
		}
		//获取最小公倍数
		//获取两个数中的较大值
		int max = (m >= n)?m:n;
		//遍历
		for (int i = max; i <=m*n ; i++) {
			if(i % m ==0 && i % n ==0) {
				System.out.println("最小公倍数"+i);
				break;
			}
		}
	}

}
