package ro.uvt.LabSP;

import ro.uvt.LabSP.services.Element;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture, Visitee {
    private String imageName;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String getName() {
        return imageName;
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
    public String url() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void accept(Visitor v) {
        v.visitImage(this);
    }
}