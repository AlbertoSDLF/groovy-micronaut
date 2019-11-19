package example.micronaut

import example.micronaut.entity.Book
import example.micronaut.repository.BookRepository
import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@CompileStatic
@Controller("/api/book")
//@Produces(MediaType.APPLICATION_JSON)
class BookController {

	private final BookRepository bookRepository

	BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository
	}

	@Get
	//	@PermitAll
	List<Book> list() {
		bookRepository.findAll()
	}

	//	@Get("/secure")
	//	List<Book> secureList() {
	//		bookRepository.findAll()
	//	}
}
