package com.lm;

import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface BookRepository extends Repository<Book, Long> {

    void delete(Long bookId);

    Book findById(Long bookId);
}
