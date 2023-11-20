package ro.uvt.LabSP;

public class Author {

    private String name;

    public Author(String string) {
        this.name = string;
    }

    public void print() {
        System.out.println("Author: " + name);
    }

}
