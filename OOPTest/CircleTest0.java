package OOPTest;
/*
利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
//测试
public class CircleTest0 {
    public static void main(String[] args) {
        Circle0 c1 = new Circle0();
        c1.radius = 2.1;
        //方式一
//        double area = c1.findArea();
//        System.out.println(area);
        //方式二
        c1.findArea();

    }
}

//圆
class Circle0 {
    //属性
    double radius;
    //求圆的面积
    //方式一
//    public double findArea(){
//        return Math.PI * radius * radius;
//    }
    //方式二
    public void findArea(){
        double area = Math.PI * radius * radius;
        System.out.println("面积为"+area);
    }
}
