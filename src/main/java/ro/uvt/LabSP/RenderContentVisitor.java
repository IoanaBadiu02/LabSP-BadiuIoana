package ro.uvt.LabSP;

import ro.uvt.LabSP.services.Element;

import java.util.List;

public class RenderContentVisitor implements Visitor{
    @Override
    public void visitParagraph(Paragraph p) {
        String alignedText = p.getAlignStrategy().render("Paragraph: " + p.getText(), 60);
        System.out.println(alignedText);
    }

    @Override
    public void visitSection(Section s) {
        System.out.println(s.getTitle());
        List<Element> content = s.getContent();
        for (Element element : content) {
            if (element instanceof Paragraph){
                System.out.println(((Paragraph) element).getAlignStrategy().render("Paragraph: " + ((Paragraph) element).getText(), 60));
            }
        }
    }

    @Override
    public void visitImage(Image i) {
        System.out.println("Image with name: " + i.getName());
    }

    @Override
    public void visitBook(Book b) {
        System.out.println("Book: " + b.getTitle());
        System.out.println("Authors:");
        for (Author author : b.getAuthors()) {
            author.print();
        }
        for (Element content : b.getContents()) {
            if(content instanceof Table) {

            }
        }
    }

    @Override
    public void visitTable(Table t) {
        System.out.println("Table: " + t.getTitle());
    }
}
