//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package package1;
public class encapsulation {
    private int sotunhien;

    public encapsulation() {
    }

    public int getSotunhien() {
        return this.sotunhien;
    }

    public void setSotunhien(int sotunhien) {
        if (sotunhien >= 0) {
            this.sotunhien = sotunhien;
        } else {
            System.out.println("Số không hợp lệ");
        }

    }
}
