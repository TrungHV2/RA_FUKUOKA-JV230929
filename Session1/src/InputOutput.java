import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        String name = "Hoàng Văn Trung", email = "trunghv.lsd@gmail.com";
        System.out.println("In xong xuống dòng"); // In xong xuống dòng mới
        System.out.println("In xong xuống dòng"); // In xong xuống dòng mới
        System.out.print("In không xuống dòng"); // In xong không xuống dòng
        System.out.print("In không xuống dòng"); // In xong không xuống dòng
        System.out.printf("\nTên tôi là: " + name + " | Email: " + email); // In với định dạng
        // %[x]s: chuỗi
        // %[x.y]d: byte, short, int, long
        // %[x.y]f: float, double
        // %b: boolean
        // [x]: x số khoảng trống in ra giá trị
        // [x.y]: x số khoảng trống in ra giá trị, y là số chữ số sau dấu phảy động
        double money = 345.345345345435;
        System.out.printf("Money: %.2f", money);
        System.out.printf("\nTên tôi là: %s | Email: %s", name, email); // In với định dạng
        System.out.printf("\nTên tôi là: |%s| | Email: |%s|", name, email); // In với định dạng
        System.out.printf("\nTên tôi là: |%-20s| | Email: |%20s|\n", name, email); // In với định dạng


        // Tạo đối tượng nhập
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
//        int age = sc.nextInt();
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập email: ");
        email = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập số dư: ");
        double balance = Double.parseDouble(sc.nextLine());
        System.out.printf("Họ tên: %s | Tuổi: %d | Email: %s | Giới tính: %s | Số dư: %f", name, age, email, gender, balance);
    }
}
