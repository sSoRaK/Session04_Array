import java.util.Arrays;
import java.util.Scanner;

public class AddElementArrayMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[10];
        array1 = new int[]{10, 4, 6, 7, 8, 6};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array1));

        System.out.print("Nhập giá trị phần tử muốn thêm vào mảng: ");
        int addElement = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vị trí index_add muốn thêm vào mảng: ");
        int index_add = Integer.parseInt(scanner.nextLine());

        // kiểm tra index_add của addElement
        if (index_add < 0 || index_add > array1.length) {
            System.err.println("Không thẻ chèn " + addElement + " vào mảng.");
            return;
        }
        // tăng kích thước mảng
        // mảng sau khi thêm length lớn hơn mảng ban đầu
        int[] array2 = new int[array1.length + 1];
        // thêm phẩn tử vào mảng array1
        for (int i = 0; i < array2.length; i++) {
            if (i < index_add) {
                array2[i] = array1[i];
            } else if (i == index_add) {
                array2[i] = addElement;
            } else {
                array2[i] = array1[i - 1];
            }
        }
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(array2));
    }
}
