import java.util.Scanner;

public class LookingForValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // cho array studentName
        String[] studentName = {"Thao", "Thanh", "Huyen", "Nam", "Cuong", "Yen", "Minh"};
        // Nhập vào tên sinh viên cần tìm
        System.out.print("Nhập vào tên sinh viên cần tìm: ");
        String name = scanner.nextLine();
        boolean isCheck = false;
        for (int i = 0; i < studentName.length; i++) {
            // == so sánh address -> khác nhau vùng nhớ
            // array.equals() so sánh value
            if (studentName[i].equals(name)) {
                System.out.printf("Tìm thấy sinh viên %s. nằm vị trí %d trong mảng\n", name, i);
                isCheck = true;
                break;
            }
        }
        if (!isCheck) {
            System.err.printf("Không tìm thấy sinh viên %s.", name);
        }
    }
}
