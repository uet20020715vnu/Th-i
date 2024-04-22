package package1;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class encapsulationdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        encapsulation stn = new encapsulation();
        int i = sc.nextInt();
        stn.setSotunhien(i);
        //System.out.println(stn.sotunhien);    Do số tự nhiên đã encapsulation qua private nên Main không truy cập được
        System.out.println("Giá trị của số tự nhiên là: " + stn.getSotunhien());

    }
}