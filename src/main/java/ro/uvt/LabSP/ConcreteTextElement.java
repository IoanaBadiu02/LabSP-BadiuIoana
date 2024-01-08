package ro.uvt.LabSP;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import ro.uvt.LabSP.services.Element;

import java.util.List;

@Entity
public class ConcreteTextElement implements Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Implement methods from Element interface

    @Override
    public List<Element> add(List<Element> l, Element element) {
        // Implementation
        return null;
    }

    @Override
    public Element get(List<Element> l, int index) {
        // Implementation
        return null;
    }

    @Override
    public void remove(List<Element> l, Element element) {
        // Implementation
    }
}
