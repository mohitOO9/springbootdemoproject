package repositories;

import org.springframework.data.repository.CrudRepository;

import entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
