import java.util.ArrayList;
import java.util.List;

class Chapter {
    private String title;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String title) {
        this.title = title;
    }

    public SubChapter addSubChapter(String title) {
        SubChapter subChapter = new SubChapter(title);
        subChapters.add(subChapter);
        return subChapter;
    }

    public void print() {
        System.out.println("- " + title);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}