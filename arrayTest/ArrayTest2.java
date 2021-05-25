package arrayTest;
/*
对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素而存在。
其实,从数组底层的运行机制来看，其实没有多维数组。

二维数组的使用:
二维数组的声明和初始化
如何调用数组的指定位置的元素
如何获取数组的长度
如何遍历数组
数组元素的默认初始化值
数组的内存解析

规定：
二维数组分为外层数组的元素和内层数组的元素
int[][] arr = new int[4][3];
外层元素:arr[0]  arr[1]
内层元素：arr[0][0] arr[1][2]
数组元素的默认初始化值
初始化方式一：比如int[][] arr = new int[4][3];
外层元素的初始化值为：地址值
内层元素的初始化值为：与一维数组初始化情况相同
初始化方式二：int[][] arr = new int[4][];
外层元素的初始化值：null
内层元素的初始化值：不能调用，否则报错
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};//一维数组
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //动态初始化
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];

        int[] arr4[] = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);
        //如何获取数组的长度
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3

        //如何遍历数组
        for (int i =0;i<arr4.length;i++){
            for (int j=0;j<arr4[i].length;j++){
                System.out.print(arr4[i][j]+"  ");
            }
            System.out.println();
        }

        //数组元素的默认初始化值
        int[][] arr5 = new int[4][3];
        System.out.println(arr5[0]);
        System.out.println(arr5[0][0]);
    }
}
