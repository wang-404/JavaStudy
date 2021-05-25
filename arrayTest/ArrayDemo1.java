package arrayTest;

import java.util.Scanner;

/*
从键盘读入学生成绩，找出最高分，并输出学生成绩等级
成绩>=最高分-10 等级为‘A’
成绩>=最高分-20 等级为‘B’
成绩>=最高分-30 等级为‘C’
其余    等级为'D'

提示：先读入学生人数，根据人数创建数组  存放成绩
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int number = scanner.nextInt();
        //创建数组，存储学生成绩
        int[] score = new int[number];
        //给数组赋值
        System.out.println("请输入"+number+"个学生成绩");
        for (int i =0;i<score.length;i++){
            score[i] = scanner.nextInt();
        }
        //获取数组中元素的最大值 最高分
        int maxScore = 0;
        for (int i=0;i<score.length;i++){
            if (maxScore<score[i]){
                maxScore=score[i];
            }
        }
        System.out.println("最高成绩"+maxScore);
        //根据学生成绩与最高分差值，得到学生等级，并输出等级和成绩
        char level;
        for (int i =0;i<score.length;i++){
            if (maxScore-score[i]<=10){
                level='A';
            }else if (maxScore-score[i]<=20){
                level='B';
            }else if (maxScore-score[i]<=30){
                level='C';
            }else{
                level='D';
            }
            System.out.println("student "+i+" score is "+score[i]+" ,grade is "+level+"");
        }

    }
}
