package af.gov.graphQL.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleinputValidationException(MethodArgumentNotValidException ex){
         Map<String,String> error=new HashMap<>();
         ex.getBindingResult().getFieldErrors().forEach(err->{
            error.put(err.getField(), err.getDefaultMessage());
         });
         return error;
    }

    @ExceptionHandler(SaveException.class)
    public ProblemDetail saveExceptionhandler(SaveException ex){
        return ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }
}
