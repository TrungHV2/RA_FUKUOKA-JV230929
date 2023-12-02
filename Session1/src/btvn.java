import java.util.Scanner;

public class btvn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.print("Nhập số có 3 chữ số: ");
            str = sc.nextLine();
        } while (str.length() != 3);
        int number = Integer.parseInt(str);
        // Đọc số thành chữ
        System.out.println(number);
    }
}
