import java.util.Scanner;

public class Bai_01_ReverseElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập kích thước mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.err.println("Nhập lại kích thước mảng nhỏ hơn 20!");
            }
        } while (size > 20);
        int[] array = new int[size];
        // Nhập giá trị từng element trong array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        // In ra mảng đảo ngược
        String str_output = "";
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            str_output += String.format("%d\t", array[i]);
        }
        System.out.printf("%s ", str_output);
    }
}
