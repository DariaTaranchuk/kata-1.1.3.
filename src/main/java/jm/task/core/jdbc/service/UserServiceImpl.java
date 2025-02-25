package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl userDaoo = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDaoo.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoo.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoo.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoo.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoo.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoo.cleanUsersTable();
    }
}
