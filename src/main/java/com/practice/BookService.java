package com.lm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return Collections.emptyList();
    }

    public void delete(Long id) {
        bookRepository.delete(id);
    }

    public void updateStars(Long bookId, Book book) {
        Book persistedBook = bookRepository.findById(bookId);
    }
}
