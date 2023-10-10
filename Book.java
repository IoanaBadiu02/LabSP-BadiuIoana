import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private List<Chapter> chapters = new ArrayList<>();

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Methods to add chapters and print book information
    public Chapter addChapter(String title) {
        Chapter chapter = new Chapter(title);
        chapters.add(chapter);
        return chapter;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Chapters:");
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}
