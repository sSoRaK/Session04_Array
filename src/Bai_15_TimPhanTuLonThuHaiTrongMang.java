import java.util.Scanner;

public class Bai_15_TimPhanTuLonThuHaiTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrInt = new int[5];
        // nhập giá trị mảng
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("arrInt[%d]= ", i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        // in mảng
        System.out.print("Các giá trị của mảng: ");
        for (int element : arrInt) {
            System.out.printf("%d\t", element);
        }
        System.out.println();
        // tìm max lớn thứ 2 trong mảng
        int max1 = arrInt[0];
        int max2 = arrInt[0];
        for (int element : arrInt) {
            if (max1 < element) {
                max2 = max1;
                max1 = element;
            } else {
                if (max2 < element) {
                    max2 = element;
                }
            }
        }
        System.out.printf("Phần tử lớn thứ hai trong mảng: %d\n", max2);
    }
}
