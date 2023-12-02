public class Program {
    public static void main(String[] args) {
        // Khai báo mảng
        int[] numbers;
        //String names[];
        // Khởi tạo giá trị
        numbers = new int[3];
        // Gán giá trị cho phần tử
        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 1;
        // Duyệt mảng
//        System.out.println("number[0]: " + numbers[0]);
//        System.out.println("number[0]: " + numbers[1]);
//        System.out.println("number[0]: " + numbers[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println("number["+i+"]: " + numbers[i]);
        }

        // Khai báo, khởi tạo, gán giá trị
        String names[] = new String[] {"Hiên", "Bình", "Sơn", "Tùng"};
        // for-each
        for (String item : names) {
            System.out.println(item);
        }
        // Mảng đa chiều
        int[][] matrix = new int[3][];
        matrix[0] = new int[] {1,2,3,4,5};
        matrix[1] = new int[] {1,2,3};
        matrix[2] = new int[] {1,2};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Gọi hàm
        hello();
        int x = sum(5, 7);
        System.out.println("Total 5 + 7 = " + x);
    }
    // Định nghĩa phương thức/hàm
    static void hello() {
        System.out.println("Xin chào các bạn!");
    }

    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
