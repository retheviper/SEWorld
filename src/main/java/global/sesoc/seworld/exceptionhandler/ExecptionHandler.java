package global.sesoc.seworld.exceptionhandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ExecptionHandler {

	@ExceptionHandler(Exception.class)
	public String errorHandler(final Exception exception) {
		log.error(exception.getMessage());
		return "/error/errorView";
	}
}
