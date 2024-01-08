package ro.uvt.LabSP;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import ro.uvt.LabSP.Persistence.BooksRepository;

@Service
public class BookService {
    private final BooksRepository booksRepository;

    @Autowired
    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Book getBookById(Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    public void createBook(Book book) {
        booksRepository.save(book);
    }

    public void updateBook(Long id, Book updatedBook) {
        if (booksRepository.existsById(id)){
            updatedBook.setId(id);
            booksRepository.save(updatedBook);
        }
    }

    public void deleteBook(Long id) {
        booksRepository.deleteById(id);
    }
}
