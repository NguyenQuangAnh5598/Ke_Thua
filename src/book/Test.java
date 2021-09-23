package book;

//import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        Book[] lish = new Book[3];
//        for (int i = 0; i < lish.length; i++) {
//            System.out.println("Nhập tên sách");
//            String name = scanner.nextLine();
//            System.out.println("Nhập giá");
//            int price = scanner.nextInt();
//            lish[i] = new ProgrammingBook(name, price);
//        }

        Book book1 = new ProgrammingBook("book1", 10, "java");
        Book book2 = new ProgrammingBook("book2", 11, "java");
        Book book3 = new ProgrammingBook("book3", 12, "java");
        Book book4 = new ProgrammingBook("book4", 103, "java");
        Book book5 = new ProgrammingBook("book5", 104, "java");

        Book book6 = new FictionBook("book6", 15);
        Book book7 = new FictionBook("book7", 16);
        Book book8 = new FictionBook("book8", 150);
        Book book9 = new FictionBook("book9", 156);
        Book book10 = new FictionBook("book10", 157);


        Book[] bookLish = new Book[10];
        bookLish[0] = book1;
        bookLish[1] = book2;
        bookLish[2] = book3;
        bookLish[3] = book4;
        bookLish[4] = book5;
        bookLish[5] = book6;
        bookLish[6] = book7;
        bookLish[7] = book8;
        bookLish[8] = book9;
        bookLish[9] = book10;

        System.out.println("Giá 10 quyển sách là " + getSum(bookLish));

        System.out.println("Has " + getCount(bookLish,"java") + " book have java Language");
    }

    public static int getSum(Book[] lish) {
        int sum = 0;
        for (int i = 0; i < lish.length; i++) {
            sum += lish[i].getPrice();
        }
        return sum;
    }

    public static int getCount(Book[] lish,String language) {
        int count = 0;
        for (int i = 0; i < lish.length; i++) {
            if (lish[i] instanceof ProgrammingBook) {
                if (((ProgrammingBook) lish[i]).getLanguage().equals(language)) {
                    count++;
                }
            }
        }
        return count;
    }
}