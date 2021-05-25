package arrayTest;
/*
数组的概述
数组的理解：数组(Array)，是多个相同类型的数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理
数组相关概念
数组名
数组元素
角标、下标、索引
数组的长度：元素的个数
数组特点：数组是有序排列的
数组属于引用数中开辟一块连续的空间
数组的长度一旦确定就不能修改据类型的变量，数组的元素既可以是基本数据类型也可以是引用数据类型
创建数组对象会在内存
数组分类：
按照维数：一维数组、二维数组
按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组

一维数组的使用
一维数组的声明和初始化
如何调用数组的指定位置的元素
如何获取数组的长度
如何遍历数组
数组元素的默认初始化值
数组的内存解析
 */
public class ArrayTest {
    public static void main(String[] args) {
        //一维数组的声明和初始化
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明+初始化

        int[] ids;//声明
        ids = new int[]{1001,1002,1003,1004};//静态初始化,数组的初始化和数组元素的赋值操作同时进行
        //动态初始化，数组的初始化和数组元素的赋值分开进行
        String[] names = new String[5];
        // 总结：数组初始化完成，长度确定

        //调用数组指定位置的元素：通过角标的方式调用
        //数组的角标或索引，从0开始，到数组的长度-1ji结束
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "qwe";
        names[3] = "asd";
        names[4] = "dfg";

        //如何获取数组的长度 ，
        //属性：length
        System.out.println(names.length);
        System.out.println(ids.length);

        //如何遍历数组元素
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        for (int i =0;i<names.length;i++){
            System.out.println(names[i]);
        }

        //数组元素的默认初始化值
        //数组元素是整型：0、数组元素是浮点型：0.0、数组元素是char型：0  数组元素是boolean型：false
        //数组元素是引用数据类型：null
        int[] arr = new int[4];
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        float[] arr2 = new float[4];
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        char[] arr3 = new char[3];
        for (int i =0;i<arr3.length;i++){
            System.out.println("-----"+arr3[i]+"*****");
        }

        boolean[] arr4 = new boolean[3];
        System.out.println(arr4[0]);

        String[] arr5 = new String[5];
        System.out.println(arr5[1]);

        //数组的内存解析






    }
}
