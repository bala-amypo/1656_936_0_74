package.com.example.demo.exception;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(FValidationException.class)

    public RespondEntity<String>handleValidationException(ValidationException ex){
        return new ResponseEntity<String>
    }
}