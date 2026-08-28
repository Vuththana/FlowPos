package goros.userservice.service;

import goros.userservice.dao.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
}
