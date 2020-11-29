package global.sesoc.seworld.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExecptionHandler {

	@ExceptionHandler(Exception.class)
	public String errorHandler(Exception e) {
		System.out.println(e);
		e.printStackTrace();
		return "/error/errorView";
	}
}
