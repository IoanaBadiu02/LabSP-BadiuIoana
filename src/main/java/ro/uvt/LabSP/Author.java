package ro.uvt.LabSP;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
public class Author {

    private String name;

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonCreator
    public Author(String string) {
        this.name = string;
    }

    public void print() {
        System.out.println("Author: " + name);
    }


    public void setId(Long id) {
        this.id = id;
    }
}
