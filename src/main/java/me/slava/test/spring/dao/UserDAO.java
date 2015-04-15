package me.slava.test.spring.dao;

import me.slava.test.spring.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> list();

    public User get(int id);

    public void saveOrUpdate(User user);

    public void delete(int id);
}