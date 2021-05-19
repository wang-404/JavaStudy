package baseStudy;

public class Random {

	public static void main(String[] args) {
		//获取10到90的随机数
		double valu = Math.random()*90 + 10;//[0.0,1.0)-->[0.0,90.0)-->[10.0-->100.0)
		int value = (int)valu;//[10.0-->100.0)-->[10,99)
		System.out.println(value);
		//公式：[a,b]:(int)(Math.random()*(b-a+1)+a)
	}

}
