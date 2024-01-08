package com.rikkeiacademy;

import com.rikkeiacademy.model.Computer;
import com.rikkeiacademy.service.NetService;
import com.rikkeiacademy.service.impl.NetServiceImpl;

import java.util.Scanner;

public class GamingNet {
    public static void main(String[] args) {
        /**
         * Viết chương trình quản lý phòng net.
         * Có các chức năng:
         *      1. Mở máy (ko chọn máy có người đang sử dụng)
         *      2. Tắt máy, tính tiền theo giờ (15000/giờ)
         *      3. Hiển thị danh sách máy trong tiệm, có kèm trạng thái ON/OFF
         *      Yêu cầu BTVN
         *      2. Tắt máy, tính tiền theo giờ (15000/giờ) và dịch vụ đã sử dụng
         *      (Giá mở máy tối thiểu 15000)
         *      4. Thêm dịch vụ cho máy (nước ngọt, mỳ tôm, cafe, ...)
         *      5. Chuyển máy (người chơi có thể chuyển từ máy A -> B)
         */
        NetService netService = new NetServiceImpl();
        netService.add(new Computer());

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Mở máy");
            System.out.println("2. Tính tiền");
            System.out.println("3. Danh sách máy");
            System.out.println("4. Thoát");
            System.out.print("Chọn tính năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Mở máy số: ");
                    String pcNo = sc.nextLine();
                    netService.onComputer(pcNo);
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }
        }
    }
}
