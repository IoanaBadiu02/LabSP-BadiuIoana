package ro.uvt.LabSP;

public class ImageProxy implements Element, Picture {
    String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
    }

    public void add(int index, Element element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public Element get(int id) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public void remove(Element element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    @Override
    public String url() {
        throw new UnsupportedOperationException("You cannot do that");
    }

    Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }
}