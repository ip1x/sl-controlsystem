package com.mrip1x.slcs.service;

import com.mrip1x.slcs.model.User;

import java.util.List;

public interface UserService {
    User findUserById(Long id);
    User findUserByEmail(String email);
    User findUserByLogin(String login);
    List<User> findAllUsers();
    List<User> findUsersByChannelId(Long id);

    User save(User user);
    List<User> saveAll(List<User> users);

    void delete(User user);
    void deleteById(Long id);
}
