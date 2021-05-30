package arrayTest;
/*
数组的复制、反转、查找（线性查找、二分法查找）
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
        //数组的复制
        String[] arr1 = new String[arr.length];
        for (int i=0;i<arr1.length;i++){
            arr1[i] = arr[i];
        }

        //数组反转
//        for(int i=0;i<arr.length/2;i++){
//            String temp = arr[i];
//            arr[i] = arr[arr.length - i + 1];
//            arr[arr.length - i + 1] = temp;
//        }
//

        // 遍历
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //查找
        //线性查找
        String dest = "BB";
        boolean isFlag = true;
        for (int i=0;i<arr.length;i++){
            if (dest.equals(arr[i])){
                System.out.println("找到了，位置为"+i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("没有找到！");
        }
        //二分查找法
        //前提：所要查找的数组必须有序
        int[] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int dest1 = -34;
        int head = 0;//初始的首索引
        int end = arr2.length-1;//初始的尾索引
        boolean isFlag1 = true;
        while (head <= end){
            int middle = (head+end)/2;
            if (dest1 == arr2[middle]){
                System.out.println("找到了指定的元素，位置为："+middle);
                isFlag1 = false;
                break;
            }else if (arr2[middle] > dest1){
                end = middle -1;
            }else {
                head = middle +1;
            }
        }
        if (isFlag1){
            System.out.println("很遗憾，没找到！！！");
        }

    }
}
