package lesson001.homeTask01.task02;

public class Book {
    public static void main(String[] args) {
    Title title1 = new Title();
    Author author1 = new Author();
    Content content1 = new Content();

    title1.bookTitle = "The Hound of the Baskervilles";
    author1.bookAuthor = "Arthur Conan Doyle";
    content1.bookContent = "Chapter 1 Mr.Sherlock Holmes";

    title1.show();
    author1.show();
    content1.show();
    }
}

class Title {
    String bookTitle;

    void show () {
        System.out.println("Title of the book: " + bookTitle);
    }
}

class Author {
    String bookAuthor;

    void show (){
        System.out.println("Book author: " + bookAuthor);
    }
}

class Content {
    String bookContent;

    void show () {
        System.out.println("Book's contents: " + bookContent);
    }
}

