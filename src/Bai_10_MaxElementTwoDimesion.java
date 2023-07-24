import java.util.Arrays;
import java.util.Scanner;

public class Bai_10_MaxElementTwoDimesion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kích thước cột: ");
        int col = Integer.parseInt(scanner.nextLine());
        float[][] arrFloat = new float[row][col];
        // Nhập giá trị mảng 2 chiều
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrFloat[%d][%d]= ", i, j);
                arrFloat[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
        // In mảng 2 chiều
        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%.1f ", arrFloat[i][j]);
            }
            System.out.println();
        }
        // khai báo maxElement
        float maxElement = arrFloat[0][0];
        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 0; j < arrFloat.length; j++) {
                if (maxElement < arrFloat[i][j]) {
                    maxElement = arrFloat[i][j];
                }
            }
        }
        System.out.printf("Phần tử lớn nhất trong mảng 2 chiều: %.1f", maxElement);
    }
}
