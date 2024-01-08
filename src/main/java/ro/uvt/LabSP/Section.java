package ro.uvt.LabSP;

import ro.uvt.LabSP.services.Element;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee {

    private String title;
    private List<Element> content = new ArrayList<>();

    public Section(String string) {
        this.title = string;
    }

    public int add(Element element) {
        content.add(element);
        return content.indexOf(element);
    }

    public String getTitle(){
        return title;
    }

    public List<Element> getContent(){
        return content;
    }
    public Element get(int index) {
        return content.get(index);
    }

    public void remove(Element element) {
        content.remove(element);
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
    }
}
