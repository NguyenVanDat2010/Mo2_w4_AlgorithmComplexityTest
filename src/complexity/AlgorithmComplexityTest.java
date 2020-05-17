package complexity;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String myString = scanner.nextLine();

        //Tính tần suất xuất hiện của các ký tự trong chuỗi vừa nhập
        int[] frequentChar = new int[255];

        for (int i = 0; i < myString.length(); i++) {
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) myString.charAt(i);
            /* Tăng giá trị tần suất */
            frequentChar[ascii]++;
        }

        //Tìm ký tự có tần suất xuất hiện nhiều nhất
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
