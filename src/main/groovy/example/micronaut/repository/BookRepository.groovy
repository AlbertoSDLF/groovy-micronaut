package example.micronaut.repository

import example.micronaut.entity.Book

interface BookRepository {
	List<Book> findAll()
}