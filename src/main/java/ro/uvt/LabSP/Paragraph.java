package ro.uvt.LabSP;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
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
        System.out.println("Paragraph: " + text);
    }

    public void print(int lineLength) {
        String alignedText = alignStrategy.render("Paragraph: " + text, lineLength);
        System.out.println(alignedText);
    }

}