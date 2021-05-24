package studyDemo;
/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
说明：
不在循环条件部分限制次数的结构，for(;;)或while(true)
结束循环方式：方式一：循环条件部分返回false，方式二：在循环中，执行break
 */
import java.util.Scanner;
public class xunhuantest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0;//记录正数的个数
        int negativeNumber = 0;//记录负数的个数
        while (true){
            int number = scan.nextInt();
            if(number > 0){
                positiveNumber++;
            }else if (number < 0){
                negativeNumber++;
            }else {
                break;
            }
        }
        System.out.println("正数个数："+positiveNumber);
        System.out.println("负数个数"+negativeNumber);
    }
}
