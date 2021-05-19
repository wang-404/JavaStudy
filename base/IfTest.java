package baseStudy;
/*
 分支结构中的if-else（条件判别结构）
 一、三种结构
 1
if (条件表达式){
执行代码块；
}
2、二选一
if(条件表达式){
执行代码块1;
}else{
执行代码块2；
}
3、多选一
if(条件表达式1){
执行代码块1；
}else if(条件表达式2){
执行代码块2；
}else{
执行代码块3；
}

 */
public class IfTest {

	public static void main(String[] args) {
		//举例1
		int heartBeats = 78;
		if (heartBeats < 60 || heartBeats > 100) {
			System.out.println("需要做进一步检查");
		}
		System.out.println("检查结束");

		//举例2
		int age = 23;
		if (age < 18) {
			System.out.println("看动画片");
		}else {
			System.out.println("看电影");
		}
		
		//举例3
		if (age < 0) {
			System.out.println("输入年龄不合适");
		}else if(age < 18) {
			System.out.println("青少年时期");
		}else if (age < 35) {
			System.out.println("青壮年时期");
		}else if (age < 60) {
			System.out.println("中年时期");
		}else if (age < 120) {
			System.out.println("老年时期");
		}else {
			System.out.println("年龄过大");
		}
	}

}
