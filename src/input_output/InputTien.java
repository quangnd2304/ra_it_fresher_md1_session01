package input_output;

import java.util.Scanner;

public class InputTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập mã sách");
        String bookId = scanner.nextLine();
        System.out.println("Hãy nhập tên sách");
        String bookName = scanner.nextLine();
        System.out.println("Hãy nhập giá sách");
        float bookPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Hãy nhập tên tác giả");
        String author = scanner.nextLine();
        System.out.println("Hãy nhập nhà xuất bản");
        String publisher = scanner.nextLine();
        System.out.println("Hãy nhập trạng tháis sách");
        boolean bookStatus = Boolean.parseBoolean(scanner.nextLine());



        System.out.printf("Mã sách: %s - Tên sách:%s - Tác giả: %s \n",bookId,bookName,author);
        System.out.printf("Giá sách: %f - Nhà xuất bản: %s - Trạng thái sách: %b \n",bookPrice,publisher,bookStatus);

    }
}
