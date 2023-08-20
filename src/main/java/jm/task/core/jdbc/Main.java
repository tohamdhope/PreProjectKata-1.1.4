package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Antony", "Volov", (byte) 35);
        userService.saveUser("Elliot", "Alder", (byte) 28);
        userService.saveUser("Denis", "Egorov", (byte) 21);
        userService.saveUser("Makar", "Ivanov", (byte) 34);
        System.out.println("+-------+---------------+--------------------+----------+");
        System.out.println("|   id  |     name      |    lastName        |    age   |");
        System.out.println("+-------+---------------+--------------------+----------+");
        userService.getAllUsers();

        userService.cleanUsersTable();
        // userService.dropUsersTable();

    }
}
