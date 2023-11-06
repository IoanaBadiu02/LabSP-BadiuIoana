public class labMain {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph(
                "Textul contine mai multe cuvinte si acesta va trebui afisat pe mai multe randuri, astfel acest rand va fi randat pe urmatorul rand");
        cap1.add(p1);
        Paragraph p2 = new Paragraph(
                "Textul contine mai multe cuvinte si acesta va trebui afisat pe mai multe randuri, astfel acest rand va fi randat pe urmatorul rand");
        cap1.add(p2);
        Paragraph p3 = new Paragraph(
                "Textul contine mai multe cuvinte si acesta va trebui afisat pe mai multe randuri, astfel acest rand va fi randat pe urmatorul rand");
        cap1.add(p3);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print(60);

        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print(60);
    }
}
