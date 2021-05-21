package baseStudy;
/*
 while循环的使用
 循环结构的4个要素：初始化条件、循环条件(boolean类型)、循环体、迭代条件

while循环的结构
初始化条件
while(循环条件){
	循环体
	迭代条件
}
注意：
迭代条件，不写迭代条件，容易造成死循环
写程序，避免出现死循环
for循环与while循环可以相互转换
 */
public class WhileTest {

	public static void main(String[] args) {
		//遍历100以内的所有偶数
		int i = 1;
		while (i <= 100) {
			if (i % 2 ==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
