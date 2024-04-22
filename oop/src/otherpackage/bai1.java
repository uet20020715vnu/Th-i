package otherpackage;

import javax.swing.*;
import java.util.Scanner;

public class bai1
{
    public String tensanpham;
    double donGia;
    protected double giamgia;
    public int soluong;

    public bai1(){
        this(null, 0, 0);//gọi constructor cùng lớp
    }
    public bai1(String tensanphamp, double donGia, double giamGia){
        this.tensanpham = tensanpham;   //gọi biến instance
        this.donGia = donGia;
        this.giamgia = giamgia;
    }
    public bai1(String tensanpham, double donGia){
        this(tensanpham, donGia, 0);
    }
    public double getThueNhapKhau() {
        return 0.1 * donGia;

    }
    public void xuat(){
        System.out.println("Tên sản phẩm: " + tensanpham +"\n\r"+
                " Đơn giá: " + donGia + "\n\r"+
                " Giảm giá: " + giamgia +"\n\r"+
                " Thuế nhập khẩu: "+ this.getThueNhapKhau());
    }
    public void nhap(){

        System.out.println("Nhap san pham");
        this.tensanpham = input.nextLine();
        System.out.println("Nhap don gia");
        this.donGia = input.nextDouble();
        input.nextLine();
        System.out.println("Nhap giam gia");
        this.giamgia = input.nextDouble();
        input.nextLine();
        System.out.println("Nhap so luong");
        this.soluong= input.nextInt();
        input.nextLine();

    }
    Scanner input = new Scanner(System.in);
    public void gioHang(){
        System.out.println(soluong*donGia);
    }




}
