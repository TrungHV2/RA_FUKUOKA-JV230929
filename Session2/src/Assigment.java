import java.util.Scanner;
import java.util.regex.Pattern;

public class Assigment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, email, phone;
        Pattern validPhone = Pattern.compile("0[98763]\\d{8}");
        Pattern validEmail = Pattern.compile("^[\\w.]+@[\\w.-]+\\.[a-z]{2,4}$");

        System.out.print("Nhập họ tên: ");
        name = sc.nextLine();
        do {
            System.out.print("Nhập sđt: ");
            phone = sc.nextLine();
        } while (!phone.matches("0[98763]\\d{8}"));
        do {
            System.out.print("Nhập email: ");
            email = sc.nextLine();
        } while (!validEmail.matcher(email).matches());

        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);


    }
}
