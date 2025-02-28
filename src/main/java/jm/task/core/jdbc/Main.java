package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("dasha", "ivanova", (byte) 23);
        userService.saveUser("katya", "kudryashova", (byte) 31);
        userService.saveUser("vika", "frolova", (byte) 54);
        userService.saveUser("masha", "gagarina", (byte) 88);
        userService.getAllUsers().toString();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
