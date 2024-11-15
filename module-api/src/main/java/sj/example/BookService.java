package sj.example;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    public Book getBook(){
        Book book = new Book();
        book.setId(1L);
        book.setContent("kimd0");
        return book;
    }
}
