package ro.uvt.LabSP;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Author {

    private String name;

    @JsonCreator
    public Author(String string) {
        this.name = string;
    }

    public void print() {
        System.out.println("Author: " + name);
    }

}
