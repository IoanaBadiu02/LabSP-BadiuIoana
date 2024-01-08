package ro.uvt.LabSP.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.LabSP.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}