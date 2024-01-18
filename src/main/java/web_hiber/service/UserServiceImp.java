package web_hiber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web_hiber.dao.UserDao;
import web_hiber.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers(){return userDao.getAllUsers();}
    @Override
    @Transactional
    public void createUser(User user) {userDao.createUser(user);}
    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {return userDao.getUserById(id);}
    @Override
    @Transactional
    public void editUser(Long id, User user) {userDao.editUser(id, user);}
    @Override
    @Transactional
    public void deleteUser(long id) {userDao.deleteUser(id);}

}
