package ro.uvt.LabSP;

import ro.uvt.LabSP.services.Element;

public class Paragraph implements Element, Visitee {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
    }

    public AlignStrategy getAlignStrategy(){
        return alignStrategy;
    }

    public String getText(){
        return text;
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

}