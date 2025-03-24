package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Иван", "Иванов", (byte) 24);
        userService.saveUser("Ivan", "Ivanov", (byte) 30);
        userService.saveUser("Никита", "Михалков", (byte) 100);
        userService.saveUser("Стас", "Петров", (byte) 50);
        List<User> allUsers = userService.getAllUsers();
        System.out.println(allUsers);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
