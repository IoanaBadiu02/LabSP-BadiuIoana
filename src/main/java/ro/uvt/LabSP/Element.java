package ro.uvt.LabSP;

import java.util.List;

public interface Element {

    default List<Element> add(List<Element> l, Element element) {
        l.add(element);
        return l;
    }

    default void remove(List<Element> l, Element element) {
        l.remove(element);
    }

    default Element get(List<Element> l, int index) {
        return l.get(index);
    }
}