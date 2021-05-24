package studyDemo;
/*
100以内所有质数的输出
质数：素数：只能被1和它本身整除的自然数
从2开始到这个数-1结束为止，都不能被这个数本省整除
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        for(int i = 2;i <= 100;i++){//遍历100以内的自然数
            boolean isFlag = true;
            for (int j =2;j<=Math.sqrt(i);j++){//被i去除
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag == true){
                System.out.println(i);
            }
        }
    }
}
