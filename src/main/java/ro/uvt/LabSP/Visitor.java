package ro.uvt.LabSP;

public interface Visitor {
    void visitParagraph(Paragraph p);
    void visitSection(Section s);
    void visitImage(Image i);
    void visitTable(Table t);
}
