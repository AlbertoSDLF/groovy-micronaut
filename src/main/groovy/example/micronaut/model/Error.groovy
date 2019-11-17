package example.micronaut.model;

import java.time.LocalDateTime;

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor;

@CompileStatic
@TupleConstructor
class Error {
	String path
	Integer errorCode
	LocalDateTime timestamp
}
