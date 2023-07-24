import java.util.Scanner;

public class TimGiaTriLonNhatTrongArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập số lượng tỷ phú: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.err.println("Số lượng tỷ phú nhỏ hơn 20!");
            }
        } while (size > 20); //tối đa cho phép nhập 20 giá trị tài sản
        int[] assetValue = new int[size];
        // Nhập giá trị tài sản tương ứng size
        for (int i = 0; i < assetValue.length; i++) {
            System.out.print("Nhập giá trị tài sản thứ " + (i + 1) + ": ");
            assetValue[i] = Integer.parseInt(scanner.nextLine());
        }
        // gán giá trị max
        int maxValue = assetValue[0];
        int maxIndex = 0;
        // tìm assetValue max trong array
        for (int i = 0; i < assetValue.length; i++) {
            if (maxValue < assetValue[i]) {
                maxValue = assetValue[i];
                maxIndex = i;
            }
        }
        System.out.printf("Giá trị tài sản lớn nhất: %d nằm thứ %d trong danh sách\n", maxValue, maxIndex);
    }
}
