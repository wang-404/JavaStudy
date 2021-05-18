package baseStudy;
/*
 三元运算符
 结构：(条件表达式)？表达式1:表达式2
 说明
 条件表达式的结果为boolea类型
 根据条件表达式真或假，决定执行表达式1，还是表达式2
 如果表达式为true，则执行表达式1
 如果表达式为false，则执行表达式2
 表达式1和表达式2要求是一致的
 三元运算符可以嵌套使用
 凡是可以使用三元运算符的地方都可以改写为if-else
 反之不成立
 如果程序既可以使用三元又可以使用if-else结构，优先使用三元运算符，原因：简洁、执行效率高。
 */
public class SanYuanTest {

	public static void main(String[] args) {
		//获取两个整数的较大值
		int m = 12;
		int n = 5;
		
		int max = (m > n)?m:n;
		System.out.println(max);
		
		String maxStr = (m > n)?"m大":"n大";
		System.out.println(maxStr);
		
		//获取三个数的最大值
		int n1 = 12;
		int n2 = 30;
		int n3 = -43;
		int max1 = (n1>n2)?n1:n2;
		int max2 = (max1>n3)?max1:n3;
		System.out.println("最大值为:"+max2);
		
		//改写成if-else
		if (m > n) {
			System.out.println(m);
		}else {
			System.out.println(n);
		}
	}

}
