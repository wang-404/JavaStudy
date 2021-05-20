package baseStudy;
/*
 for循环结构的使用
 循环结构的四个要素：初始化条件、循环条件(boolean类型)、循环体、迭代条件；
 for循环结构：
 for(初始化条件;循环条件;迭代条件){
 	循环体
 }
 执行过程：初始化条件--》循环条件--》循环体--》迭代条件--》循环条件--》循环体--》迭代条件......--》循环条件
 
 
 */
public class ForTest {

	public static void main(String[] args) {
		for(int i =1;i<=5;i++) {
			System.out.println("Hello World！");
		}
		
		//练习
		int num = 1;
		for (System.out.print('a');num <= 3;System.out.print('c'),num++) {
			System.out.print('b');
		}
		System.out.println();
		//例题：遍历一百以内的偶数、输出所有偶数的和和偶数的个数
		int sum = 0;//计入所有偶数的和
		int count = 0;//计入偶数的个数
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum  += i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
