package ro.uvt.LabSP;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@Entity
@NoArgsConstructor(force = true)
public class Book implements Visitee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToMany
    private List<Author> authors = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "book_id")
    private final List<ConcreteTextElement> contents = new ArrayList<>();

    @JsonCreator
    public Book(String string) {
        this.title = string;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(ConcreteTextElement content) {
        contents.add(content);
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
