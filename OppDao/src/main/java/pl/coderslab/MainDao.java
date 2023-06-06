package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {
    public static void main(String[] args) {
        User user1 = new User(1, "", "eduard.synohub@gmail.com", "coderslab");
        User user2 = new User(2, "Jan", "jan.kowalski@gmail.com", "coderslab");
        User user3 = new User(3, "Paweł", "paweł.bednarczyk@gmail.com", "coderslab");
        User user4 = new User(4, "Ola", "ola.proć@gmail.com", "coderslab");
        UserDao userDao1 = new UserDao();
        userDao1.create(user1);
        userDao1.create(user2);
        userDao1.create(user3);
        userDao1.create(user4);
        User show1 = userDao1.read(3);
        User show2 = userDao1.read(5);
        User show3 = userDao1.read(8);
        User show4 = userDao1.read(9);
        System.out.println(show1);
        System.out.println(show2);
        System.out.println(show3);
        System.out.println(show4);
        User userToUpdate = userDao1.read(11);
        userToUpdate.setUserName("Julia");
        userToUpdate.setEmail("julia.nowak@gmail.com");
        userToUpdate.setPassword("123456");
        userDao1.update(userToUpdate);
        System.out.println(userToUpdate);
    }
}