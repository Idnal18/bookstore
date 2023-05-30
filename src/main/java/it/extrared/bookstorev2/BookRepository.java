package it.extrared.bookstorev2;

import org.springframework.data.repository.CrudRepository;

import it.extrared.bookstorev2.model.BookModel;

public interface BookRepository extends CrudRepository<BookModel, Integer>{
    
}
