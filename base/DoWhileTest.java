package studyDemo;
/*
do-while循环的使用
循环结构的4个要素：初始化条件、循环条件(boolean类型)、循环体、迭代条件
do-while循环结构
初始化条件
do{
    循环体
    迭代条件
}while(循环条件)
执行过程 初始化条件--》循环体--》迭代条件--》循环条件--》
说明：
do-while循环至少会执行一次循环体
 */
public class DoWhileTest {
    public static void main(String[] args) {
        //遍历100以内的偶数,并计算所有偶数的和和偶数的个数
        int num = 1;
        int sum = 0;//记录总和
        int count = 0;//记录个数
        do {
            if (num % 2 == 0){
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        }while (num <= 100);
        System.out.println(sum);
        System.out.println(count);
        //**********************
        int number = 10;
        while (number > 10){
            System.out.println("hello:while");
            number--;
        }
        int number2 = 10;
        do {
            System.out.println("hello:do-while");
            number2--;
        }while (number2 > 10);
    }
}
