package arrayTest;
/*
使用二维数组打印一个10行杨辉三角。
第一行有1个元素,第n行有n个元素
每一行的第一个元素和最后一个元素都是1
从第三行开始,对于非第一个元素和最后一个元素的元素。即:
yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //声明并初始化二维数组
        int[][] yanghui = new int[10][];
        //给数组的元素赋值
        for (int i =0;i<yanghui.length;i++){
            yanghui[i] = new int[i+1];
            //每行首末元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            //每行非首末元素赋值
            if (i>1){
                for (int j =1;j<yanghui[i].length-1;j++){
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }
        //遍历二维数组
        for (int i =0;i<yanghui.length;i++){
            for (int j =0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }

//        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
//        int sum =0;//记录总和
//        for(int i=0;i<arr.length;i++){
//            for (int j =0;j<arr[i].length;j++){
//                sum += arr[i][j];
//            }
//        }
//        System.out.println(sum);
    }
}
