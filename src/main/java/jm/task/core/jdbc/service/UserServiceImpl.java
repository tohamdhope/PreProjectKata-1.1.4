package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDaoHibernate = new UserDaoHibernateImpl();
    // private static final UserDao userDao = new UserDaoJDBCImpl();
    public void createUsersTable() {
        // userDao.createUsersTable();
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
        // userDao.dropUsersTable();
        userDaoHibernate.dropUsersTable();
    }


    public void saveUser(String name, String lastName, byte age) {
        // userDao.saveUser(name, lastName, age);
        userDaoHibernate.saveUser(name, lastName, age);
        System.out.println("User: "  + name + "  " + lastName + " adding in data base HibernateDataTest");
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        /*
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
         */
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
    }
}
