package goros.userservice.controller;

import goros.userservice.dao.User;
import goros.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import goros.utils.ResponseUtils;
import goros.utils.ApiResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public ResponseEntity<ApiResponse<List<User>>> getAllUsers() {
        ApiResponse<List<User>> users = ResponseUtils.success("Users fetched successfully", userService.getAllUsers());

        return ResponseEntity.status(users.getStatus());
    }
}
