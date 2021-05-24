package studyDemo;
/*
嵌套循环的使用
嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
外层循环：循环结构B
内层循环：循环结构A
说明
内层循环结构遍历一遍，只相当于外层循环循环体执行一次
假设外层循环需要执行m次，内层循环需要执行n次，此时内层循环的循环体一共执行了m*n次
技巧
外层循环控制行数，内层循环控制列数
 */
public class forforTest {
    public static void main(String[] args) {
        //******
        for(int i =1;i<=6;i++){
            System.out.print('*');
        }
        System.out.println();
        //******
        //******
        //******
        //******
        for(int i=1;i<=4;i++){
            for(int j=1;j<=6;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        //*
        //**
        //***
        //****
        //*****
        for (int i = 1;i <= 5;i++){
            for (int j =1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        //****
        //***
        //**
        //*
        for (int i =1;i<=4;i++){
            for (int j =1;j <= 5-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        /*
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
         */
        //上半部分
        for(int i =1;i<=5;i++){
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k =1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //下半部分
        for (int i =1;i<=4;i++){
            for (int j =1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=1;k <=5-i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}