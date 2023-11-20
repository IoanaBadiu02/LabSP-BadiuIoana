package ro.uvt.LabSP;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {

    private String title;
    private List<Element> content = new ArrayList<>();

    public Section(String string) {
        this.title = string;
    }

    public int add(Element element) {
        content.add(element);
        return content.indexOf(element);
    }

    public Element get(int index) {
        return content.get(index);
    }

    public void remove(Element element) {
        content.remove(element);
    }

    public void print() {
        System.out.println(title);
        for (Element element : content) {
            element.print();
        }
    }

    public void print(int lineLength) {
        System.out.println(title);
        for (Element element : content) {
            if (element instanceof Paragraph) {
                ((Paragraph) element).print(lineLength);
            } else {
                element.print();
            }
        }
    }
}
