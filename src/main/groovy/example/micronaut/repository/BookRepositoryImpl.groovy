package example.micronaut.repository

import example.micronaut.entity.Book
import groovy.transform.CompileStatic

@CompileStatic
@Singleton
class BookRepositoryImpl implements BookRepository {

	@Override
	List<Book> findAll() {
		[
			new Book("1491950358", "Building Microservices"),
			new Book("1680502395", "Release It!"),
		]
	}
}