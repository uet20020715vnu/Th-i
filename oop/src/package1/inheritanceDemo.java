package package1;
import java.util.Scanner;
public class inheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        int j = sc.nextInt();
        //inheritance a = new inheritanceExtend(i,j); sẽ không gọi được add
        // vì a thuộc inheritance nên không gọi được phương thức trong inheritanceExtend
        inheritanceExtend a = new inheritanceExtend(i,j);
        a.print();
        a.add();
    }
}
