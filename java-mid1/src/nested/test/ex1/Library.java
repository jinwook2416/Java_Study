package nested.test.ex1;

public class Library {

    private Book[] books;
    private int amountOfBooks;

    public Library(int amount) {
        books = new Book[amount];
        amountOfBooks = 0;
    }

    public void addBook(String bookName, String author) {
        if (amountOfBooks < books.length) {
            books[amountOfBooks++] = new Book(bookName, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }


    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < amountOfBooks; i++) {
            System.out.println("도서 제목: " + books[i].name + ", 저자: " + books[i].author);
        }
    }

    private static class Book {
        String name;
        String author;

        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

    }
}
