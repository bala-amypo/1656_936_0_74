package.com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseEntity;
import com.example.demo.exception.ValidationException;                                                                                                                                                                                                                                              
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(FValidationException.class)

    public RespondEntity<String>handleValidationException(ValidationException ex){
        return new ResponseEntity<String>(ex.message(),HttpStatus.BAD_GATEWAY);
    }
}