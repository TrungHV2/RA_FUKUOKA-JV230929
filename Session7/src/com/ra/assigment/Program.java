package com.ra.assigment;

public class Program {
    public static void main(String[] args) {
        /**Cho các class như sau
        GiftConfig (Thông tin cấu hình quà tặng)
            String giftCode; // mã quà
            String giftName; // tên quà
            double rate; // tỉ lệ rơi quà
            boolean free; // quà free hay quà có giá trị
            int limitTotal; // giới hạn tổng số quà
            int limitPlayer; // giới hạn số quà/người chơi
        Player (Thông tin người chơi)
            String playerCode; // mã người chơi
            String playerName; // Tên người chơi
        GiftHistory (Thông tin lịch sử trao quà)
            String giftCode; // quà gì
            String playerCode; // trao cho ai
        Viết chương trình Java game trả thưởng với tính năng sau:
            1. Nhập mã người chơi (playerCode). Trả quà cho người chơi
                - Kiểm tra thông tin playerCode có tồn tại hay ko
                - Lấy ngẫu nhiên 1 phần quà trong kho quà
                - Kiểm tra giới hạn quà còn hay hết
                - Nếu hết quà thì trả ngẫu nhiên ra một phần quà ko giá trị (free = true)
                - Lưu thông tin lịch sử nhận quà
                - Cập nhật lại tổng số quà
            2. Nhập vào playerCode để xem danh sách quà quà đã nhận (Tên quà, Số lượng)
            3. Thoát
         */
    }
}
