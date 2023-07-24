import java.util.Scanner;

public class GTNNByMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[size];
        // nhập value cho mỗi element
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("Giá trị phần tử thứ " + (i + 1) + ": ");
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        // in các element arrInt
        System.out.print("Các giá trị trong mảng: ");
        for (int element : arrInt) {
            System.out.printf("%d\t", element);
        }
        System.out.println();
        // tìm minValue
        int result = minValue(arrInt);
        System.out.print("Giá trị nhỏ nhất trong mảng: " + result);

    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
