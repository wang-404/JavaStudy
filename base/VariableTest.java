package baseStudy;
/*
 基本数据类型之间的运算规则
 
 前提：只讨论7种基本数据类型变量间的运算，不包含Boolean类型
 
 1、自动类型提升
 	当容量小的数据类型的变量与容量大的数据类型做运算时，容量小的自动提升为容量大的数据类型。 
 	容量大小指的是：表示数的范围的大和小。比如：float容量大于long的容量
 	byte、char、short-->int-->long-->float-->double
 
 2、强制类型转换：自动类型提升运算的逆运算
 	1、需要使用强转符()
 	2、强制类型转换，可能导致精度损失
 	
 	
 */
public class VariableTest {

	public static void main(String[] args) {
		
		byte b1 = 2;
		int i1 = 12;
		//编译不通过
		//byte b2 = b1+i1;
		int i2 = b1 + i1 ;
		System.out.println(i2);
		
		float f = b1 + i1;
		System.out.println(f);
		
		short s1 = 123;
		double d1 = s1;
		System.out.println(d1);
		
		//*********************
		char c1 = 'a';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);
		
		short s2 = 10;
		//char c2 = c1 + s2;//编译不通过
		
		byte b2 = 10;
		//char c3 = c1 + b2;//编译不通过
		
		//short s3 = b2 + s2;//编译不通过
		
		//short s4 = b1 + b2;//编译不通过
		
		//*********************
		
		double d2 = 12.3;
		int i5 = (int)d2;//截断操作
		System.out.println(i5);
		//没有精度损失
		long l1 = 123;
		short s5 = (short)l1;
		//精度损失
		int i6 = 128;
		byte b3 = (byte)i6;
		System.out.println(b3);//-128
				
	}

}
