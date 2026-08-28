package goros.utils;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@Data
@Builder
public class ApiResponse<T> {
    public String message;
    public boolean success;
    public T payload;
    public HttpStatus status;
    public Instant timestamp;
}
