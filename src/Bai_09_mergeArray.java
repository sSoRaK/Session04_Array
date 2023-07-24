import java.util.Arrays;
import java.util.Scanner;

public class Bai_09_mergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // tạo 2 mảng
        int[] array1 = new int[4];
        int[] array2 = new int[3];
        // nhập giá trị cho 2 mảng
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("array1[%d]= ", i);
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("array2[%d]= ", i);
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        // tạo new array
        int size = array1.length + array2.length;
        int[] array3 = new int[size];
        // duyệt array1 và thêm từng element trong array1 vào array3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        // duyệt array2 và thêm từng element trong array2 vào array3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Kết quả: " + Arrays.toString(array3));
    }
}
