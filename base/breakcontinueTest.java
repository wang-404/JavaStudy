package studyDemo;
/*
break :switch-case  循环结构中    结束当前循环
continue :循环结构中    结束当此循环
 */
public class breakcontinueTest {
    public static void main(String[] args) {
        for (int i =1;i <=10;i++){
            if (i % 4==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
