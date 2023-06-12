package cn.ccj.service;

import cn.ccj.dao.UserDAO;
import cn.ccj.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> all() {
        return userDAO.all();
    }
}
