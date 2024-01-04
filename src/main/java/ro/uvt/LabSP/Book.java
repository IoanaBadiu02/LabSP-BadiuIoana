package ro.uvt.LabSP;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee{

    private String title;
    private Long id;
    private List<Author> authors = new ArrayList<>();
    private List<Element> contents = new ArrayList<>();

    @JsonCreator
    public Book(String string) {
        this.title = string;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element content) {
        contents.add(content);
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Element> getContents() {
        return contents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }
}
