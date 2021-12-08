package com.codingdojo.books.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.codingdojo.books.models.Book;
import com.codingdojo.books.repository.BookRepository;


@Service
public class BookService {
	// adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    //updates a book
    public Book updateBook(Long id, String title, String description, String lang, int pages) {
    	Book oldBook = this.findBook(id);
    	oldBook.setTitle(title);
    	oldBook.setDescription(description);
    	oldBook.setLanguage(lang);
    	oldBook.setNumberOfPages(pages);
    	
    	return bookRepository.save(oldBook);
        }
    // deletes a book
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}
