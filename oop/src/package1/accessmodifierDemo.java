package package1;
import otherpackage.*;
public class accessmodifierDemo extends bai1 {

    public static void main(String[] args) {
        bai1 b1 = new bai1();
        b1.nhap();
        String tensanpham = b1.tensanpham;
        //double dongia = b1.donGia;  // để default nên lỗi
        //double giamgia = b1.giamgia(); //protected nên lỗi
        // muốn truy cập vào thuộc tính protected qua kế thừa thì phải
        // truy cập bằng đối tượng lớp con nên phải khởi tạo là accessmodifierDemo b1 = new accessmodifierDemo();
        System.out.println("tensanpham = " + tensanpham);
        //System.out.println("dongia = " + b1.dongia );
        //System.out.println("giamgia = " + giamgia);
    }
}
