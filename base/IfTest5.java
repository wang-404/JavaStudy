package baseStudy;
/*
 大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件:
 高:180cm以上;富:财富1千万以上;帅:是。
如果这三个条件同时满足，则:“我一定要嫁给他!!”
如果三个条件有为真的情况，则:“嫁吧，比上不足，比下有余。”如果三个条件都不满足，则:“不嫁!”

 */
import java.util.Scanner;;
public class IfTest5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你的身高cm：");
		int height = scan.nextInt();
		System.out.println("请输入你的财富千万：");
		double wealth = scan.nextDouble();
		System.out.println("请输入是否帅true/false：");
		boolean ishand = scan.nextBoolean();
		
		/*
		 方法一：
		if (height >= 180 && wealth >= 1 && ishand) {
			System.out.println("嫁");
		}else if (height >= 180 || wealth >= 1 || ishand) {
			System.out.println("也可嫁");
		}else {
			System.out.println("不嫁");
		}
		*/
		
		//方法二
		System.out.println("请输入是否帅：是或否");
		String ishandStr = scan.next();
		if (height >= 180 && wealth >= 1 && ishandStr.equals("是")) {
			System.out.println("嫁");
		}else if (height >= 180 || wealth >= 1 || ishandStr.equals("是")) {
			System.out.println("也可嫁");
		}else {
			System.out.println("不嫁");
		}
	}

}
