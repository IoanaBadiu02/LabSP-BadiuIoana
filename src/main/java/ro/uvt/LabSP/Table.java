package ro.uvt.LabSP;

import ro.uvt.LabSP.services.Element;

class Table implements Element, Visitee {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
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

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }
}
