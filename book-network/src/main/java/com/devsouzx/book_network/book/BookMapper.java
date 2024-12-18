package com.devsouzx.book_network.book;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class BookMapper {
    public Book toBook(@Valid BookRequest request) {
        return Book.builder()
                .id(request.id())
                .title(request.title())
                .isbn(request.isbn())
                .authorName(request.authorName())
                .synopsis(request.synopsis())
                .archived(false)
                .shareable(request.shareable())
                .build();
    }
}
