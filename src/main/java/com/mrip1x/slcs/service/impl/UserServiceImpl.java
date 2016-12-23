package com.mrip1x.slcs.service.impl;

import com.mrip1x.slcs.model.User;
import com.mrip1x.slcs.repository.UserRepository;
import com.mrip1x.slcs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findUserById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public User findUserByEmail(String email) {
        return repository.findOneByEmail(email);
    }

    @Override
    public User findUserByLogin(String login) {
        return repository.findOneByLogin(login);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public List<User> findUsersByChannelId(Long id) {
        return null;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> saveAll(List<User> users) {
        return repository.save(users);
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        repository.delete(id);
    }
}
