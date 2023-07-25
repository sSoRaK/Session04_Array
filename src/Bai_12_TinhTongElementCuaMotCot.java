import java.util.Scanner;

public class Bai_12_TinhTongElementCuaMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột: ");
        int col = Integer.parseInt(scanner.nextLine());
        // tạo mảng
        float[][] arrFloat = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrFloat[%d][%d]= ", i, j);
                arrFloat[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
        // in mảng
        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%.1f\t", arrFloat[i][j]);
            }
            System.out.println();
        }
        // tính tổng element theo số cột nhập vào
        System.out.print("Nhập cột muốn tính tổng: ");
        int sumOfCol = Integer.parseInt(scanner.nextLine()) - 1;
        float result = 0; // Tổng các element ở một cột xác định
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (sumOfCol == j) {
                    result += arrFloat[i][j];
                }
            }
        }
        System.out.println();
        System.out.printf("Tổng các số ở một cột xác định: %.1f\n", result);
    }
}
