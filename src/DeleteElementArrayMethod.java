import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArrayMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1;
        array1 = new int[]{10, 4, 6, 7, 8, 6};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array1));

        System.out.print("Nhập giá trị phần tử muốn xóa trong mảng: ");
        int deleteElement = Integer.parseInt(scanner.nextLine());
        // tìm vị trí index_del của deleteElement trong mảng
        int index_del = -1;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == deleteElement) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.err.println("Không tìm thấy " + deleteElement + " trong mảng.");
            return;
        }
        // xóa phẩn tử khỏi mảng array1
        for (int i = index_del; i < array1.length - 1; i++) {
            array1[i] = array1[i + 1];
        }
        // giảm kích thước mảng
        // mảng sau khi xóa length nhỏ hơn mảng ban đầu
        int[] array2 = Arrays.copyOf(array1, array1.length - 1);
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(array2));
    }
}
