package service;

import domain.PageBean;
import domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<User> findAll();
    public void add(User user);

    User login(User user);

    void del(String id);

    User findById(String id);

    void updateUser(User user);


    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
