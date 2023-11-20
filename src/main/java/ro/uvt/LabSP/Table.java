package ro.uvt.LabSP;

class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
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
        System.out.println("Table Title: " + title);
    }
}
