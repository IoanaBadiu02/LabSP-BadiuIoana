public class lab2 {
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("Sample Book", "John Doe");

        // Add chapters, subchapters, and sections to the book
        Chapter chapter1 = myBook.addChapter("Chapter 1");
        SubChapter subChapter1 = chapter1.addSubChapter("SubChapter 1.1");
        subChapter1.addParagraph("This is a paragraph.");
        subChapter1.addImage("Image1");
        subChapter1.addTable("Table 1");

        Chapter chapter2 = myBook.addChapter("Chapter 2");
        SubChapter subChapter2 = chapter2.addSubChapter("SubChapter 2.1");
        subChapter2.addParagraph("Another paragraph.");

        // Print information about the book and its chapters
        myBook.print();
    }
}
