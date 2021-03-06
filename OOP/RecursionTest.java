package OOP;
/*
递归方法的使用
递归方法：一个方法体内调用它自身。
方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 */
public class RecursionTest {
    public static void main(String[] args) {
        //例1：计算1-100之间所有自然数的和
        //方式一
//        int sum = 0;
//        for (int i=1;i<=100;i++){
//            sum += i;
//        }
        //方式二
        RecursionTest test = new RecursionTest();
        int sum = test.getSum(100);
        System.out.println(sum);

        System.out.println("*****************");
        int value = test.f(10);
        System.out.println(value);
    }

    public int getSum(int n){
        if (n==1){
            return 1;
        }else {
            return n + getSum(n-1);
        }
    }
    //计算1-n之间所有自然数的乘积:n!
    public int getSum1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }
    }

    //已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
    //其中n是大于0的整数，求f(10)的值。
    public int f(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
//			return f(n + 2) - 2 * f(n + 1);
            return 2*f(n - 1) + f(n - 2);
        }
    }
}
