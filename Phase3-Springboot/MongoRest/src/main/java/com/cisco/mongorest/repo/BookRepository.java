package com.cisco.mongorest.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cisco.mongorest.model.Book;

public interface BookRepository extends MongoRepository<Book, String>{

}
