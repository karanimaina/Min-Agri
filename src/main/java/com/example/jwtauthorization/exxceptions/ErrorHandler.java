package com.example.jwtauthorization.exxceptions;
import com.example.jwtauthorization.commons.UniversalResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Slf4j
@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(ItemExistsException.class)
    public ResponseEntity<UniversalResponse> handleItemExistsException(Exception e){
        log.info ("Item already exists {}", e.getMessage ());
        UniversalResponse response= UniversalResponse.builder ().status (400).message (e.getMessage ()).build ();
        return ResponseEntity.ok ().body (response);
    }

    @ExceptionHandler(ItemNotFound.class)
    public ResponseEntity<UniversalResponse> handleItemNotFoundException(Exception e){
        log.info ("Item not found {}", e.getMessage ());
        UniversalResponse response=  UniversalResponse.builder ().status (400).message (e.getMessage ()).build ();
        return ResponseEntity.ok (response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<UniversalResponse> handleError500(Exception ex){
        log.info ("Exception ========================> {}", ex.getMessage ());
        ex.printStackTrace ();
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                .body(UniversalResponse.builder().status (400).message ("Server error occurred").build());
    }
    @ExceptionHandler(FileInitializationFailure.class)
    public  ResponseEntity<UniversalResponse>fileInitializationFailure(FileInitializationFailure e){
        log.info("file initialization  failure");
        return ResponseEntity.ok().body(UniversalResponse.builder().status(400).message(e.getMessage()).build());
    }
    @ExceptionHandler(RuntimeFailure.class)
    public  ResponseEntity<UniversalResponse>fileInitializationFailure(RuntimeFailure e){
        log.info("file initialization  failure");
        return ResponseEntity.ok().body(UniversalResponse.builder().status(400).message(e.getMessage()).build());
    }
}

