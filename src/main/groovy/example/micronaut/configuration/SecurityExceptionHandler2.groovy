import java.time.LocalDateTime

import org.reactivestreams.Publisher

import io.micronaut.core.async.publisher.Publishers
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.security.handlers.HttpStatusCodeRejectionHandler

//@Singleton
//@Replaces(HttpStatusCodeRejectionHandler.class)
class SecurityExceptionHandler2 extends HttpStatusCodeRejectionHandler {
	@Override
	Publisher<MutableHttpResponse<?>> reject(HttpRequest<?> request, boolean forbidden) {
		Publishers.just(HttpResponse.unauthorized().contentType(MediaType.APPLICATION_JSON).body(
				new example.micronaut.model.Error(request.getPath(), new Integer(401), LocalDateTime.now())))
	}
}