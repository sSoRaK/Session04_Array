import java.util.Scanner;

public class Bai_11_MinElementOneDimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[size];
        // nhập value element
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("arrInt[%d]= ", i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        // in array
        System.out.print("Các giá trị trong mảng: ");
        for (int element : arrInt) {
            System.out.printf("%d\t", element);
        }
        int minElement = arrInt[0];
        for (int element : arrInt) {
            if (minElement > element) {
                minElement = element;
            }
        }
        System.out.println();
        System.out.printf("Giá trị nhỏ nhất trong mảng: %d", minElement);
    }
}
