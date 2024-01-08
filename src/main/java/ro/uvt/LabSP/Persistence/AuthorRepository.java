package ro.uvt.LabSP.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.LabSP.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}