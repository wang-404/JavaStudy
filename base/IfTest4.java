package baseStudy;
/*
 假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
 1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金3 000美元。
3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。

 */
import java.util.Scanner;;
public class IfTest4 {

	public static void main(String[] args) {
		int value = (int)(Math.random()*90+10);
        System.out.println(value);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个两位数：");
        int num = scanner.nextInt();
        int num1 = num/10;
        int num2 = num%10;
        int num3 = num1 + num2*10;
        int value1 = value/10;
        int value2 = value%10;
        if(num == value){
            System.out.println("10000美元");
        }else if(num3 ==value){
            System.out.println("3000美元");
        }else if(num1 ==value1 || num2 ==value2){
            System.out.println("1000美元");
        }else if(num1 ==value2 || num2 ==value1){
            System.out.println("500美元");
        }else{
                System.out.println("没有");
        }
	}

}
