import java.util.Scanner;

public class Bai_13_TinhTongElemenDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng của mảng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột của mảng: ");
        int col = Integer.parseInt(scanner.nextLine());
        //tạo mảng
        float[][] arrFloat = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrFloat[%d][%d]= ", i, j);
                arrFloat[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
        System.out.println();
        // in mảng
        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%.1f\t", arrFloat[i][j]);
            }
            System.out.println();
        }
        // Tổng đường chéo chính và chéo phụ
        float sumMainDiagonal = 0;
        float sumSubDiagonal = 0;
        float sumBorder = 0;
        // để có chéo chính & chéo phụ, mảng 2 chiều là matrix vuông
        if (row == col) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // chéo chính
                    if (i == j) {
                        sumMainDiagonal += arrFloat[i][j];
                    }
                    // chéo phụ
                    if (i + j == row - 1) {
                        sumSubDiagonal += arrFloat[i][j];
                    }
                    // bonus: tổng 4 đường biên
                    if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                        sumBorder += arrFloat[i][j];
                    }
                }
            }
        }
        System.out.printf("Tổng đường chéo chính: %.1f\n", sumMainDiagonal);
        System.out.printf("Tổng đường chéo phụ: %.1f\n", sumSubDiagonal);
        System.out.printf("Tổng 4 đường biên: %.1f\n", sumBorder);
    }
}
