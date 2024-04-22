package package1;
public class polymorphismDemo {
    public static void main(String[] args) {
        int a =1, b =2, c =3;
        polymorphism demo = new polymorphism();
        polymorphism demo2 = new polymorphismextend();
        System.out.println("Cộng 2 số");
        System.out.println(demo.add(a,b));
        System.out.println("Cộng 2 số mở rộng");
        System.out.println(demo2.add(a,b));     //gọi hàm override
        System.out.println("Cộng 3 số");
        System.out.println(demo.add(a,b,c));    //gọi hàm overload
        System.out.println("Cộng 3 số mở rộng");
        System.out.println(demo2.add(a,b,c));   //gọi ở hàm con nhưng không override
    }
}
