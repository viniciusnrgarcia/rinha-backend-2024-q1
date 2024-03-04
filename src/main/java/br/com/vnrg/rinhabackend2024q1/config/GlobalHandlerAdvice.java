package br.com.vnrg.rinhabackend2024q1.config;

import br.com.vnrg.rinhabackend2024q1.exceptions.BalanceNotAvailableException;
import br.com.vnrg.rinhabackend2024q1.exceptions.CustomerNotFoundException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.lang.Nullable;
import org.springframework.validation.FieldError;
import org.springframework.validation.method.MethodValidationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalHandlerAdvice extends ResponseEntityExceptionHandler {


    @ExceptionHandler({CustomerNotFoundException.class})
    ProblemDetail handleCustomerNotFoundException(CustomerNotFoundException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
    }

    @ExceptionHandler({BalanceNotAvailableException.class})
    ProblemDetail handleBalanceNotAvailableException(BalanceNotAvailableException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.UNPROCESSABLE_ENTITY, e.getMessage());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                ProblemDetail
                        .forStatusAndDetail(HttpStatus.UNPROCESSABLE_ENTITY,
                                errors.entrySet()
                                        .stream()
                                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                                        .collect(Collectors.joining(", "))
                        ));
    }

}
