package OOPTest;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(p1.name+"新年龄为："+newAge);
        //***************************
        Person p2 = new Person();
        p2.showAge();//0
    }
}

