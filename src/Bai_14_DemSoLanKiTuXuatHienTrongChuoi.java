import java.util.Scanner;

public class Bai_14_DemSoLanKiTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi ký tự: ");
        String input_str = scanner.nextLine();
        int count = 0;
        System.out.print("nhập ký tự cần tìm: ");
        char searchChar = scanner.nextLine().charAt(0);
        // duyệt string
        for (int i = 0; i < input_str.length(); i++) {
            if (input_str.charAt(i) == searchChar) {
                count++;
            }
        }
        System.out.printf("Ký tự %c xuất hiện: %d\n", searchChar, count);
    }
}
