package goros.utils;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@Builder
@Data
public class ResponseUtils {
    public static<T> ApiResponse<T> success(String message, T payload) {
        return ApiResponse.<T>builder().message("").success(true).payload(payload).timestamp(Instant.now()).status(HttpStatus.OK).build();
    }
}