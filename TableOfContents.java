import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {
    private List<Element> entries = new ArrayList<>();
    private String tableName;

    public TableOfContents(String tableName) {
        this.tableName = tableName;
    }

    public void add(int index, Element element) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public Element get(int index) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public void remove(Element element) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public void print() {
        System.out.println("Table of Contents: " + tableName);
    }
}