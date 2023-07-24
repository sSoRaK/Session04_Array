import java.util.Scanner;

public class CountStudentGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        // tối đa 30 sinh viên
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 30) {
                System.err.println("Yêu cầu tối đa 30 sinh viên!");
            }
        } while (size > 30);
        float[] pointsArray = new float[size];
        // nhập giá trị point vào pointsArray
        float point;
        for (int i = 0; i < pointsArray.length; i++) {
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1 + ": "));
            point = Float.parseFloat(scanner.nextLine());
            pointsArray[i] = point;
        }
        int count = 0;
        for (int i = 0; i < pointsArray.length; i++) {
            if (pointsArray[i] >= 5.0) {
                count++;
            }
        }
        System.out.printf("Số lượng sinh viên đỗ: %d", count);
    }
}
