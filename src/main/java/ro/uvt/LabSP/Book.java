package ro.uvt.LabSP;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Element> contents = new ArrayList<>();

    public Book(String string) {
        this.title = string;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element content) {
        contents.add(content);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        for (Element element : contents) {
            element.print();
        }
    }

}
