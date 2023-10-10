import java.util.ArrayList;
import java.util.List;

class SubChapter {
    public String name;
    public List<Image> images;
    public List<Paragraph> paragraphs;
    public List<Table> tables;

    public SubChapter(String name) {
        this.name = name;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    // Method to add an image to the subchapter
    public void addImage(String imageName) {
        Image image = new Image(imageName);
        images.add(image);
    }

    // Method to add a paragraph to the subchapter
    public void addParagraph(String text) {
        Paragraph paragraph = new Paragraph(text);
        paragraphs.add(paragraph);
    }

    // Method to add a table to the subchapter
    public void addTable(String title) {
        Table table = new Table(title);
        tables.add(table);
    }

    public void print() {
    }
}
