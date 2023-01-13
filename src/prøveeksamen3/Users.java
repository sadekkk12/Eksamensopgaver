package prøveeksamen3;

import java.util.ArrayList;

public class Users {
    ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        user.setUserid(users.size() + 1);
        users.add(user);
    }

    public ArrayList<User> getUsers(Role role) {
        ArrayList<User> newList = new ArrayList<>();
        for (User user : users) {
            if (user.getRole() == role) {
                newList.add(user);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        Users user = new Users();
        User user1 = new User("Sadek", Role.Admin);
        User user2 = new User("Navid", Role.Reader);
        user.addUser(user1);
        user.addUser(user2);

        for (User userloop : user.getUsers(Role.Admin)) {
            System.out.printf("Username: %s\nUserid: %s\nprøveeksamen3.Role: %s\n", userloop.getUsername(), userloop.getUserid(), userloop.getRole());
        }
        for (User userloop : user.getUsers(Role.Reader)) {
            System.out.printf("Username: %s\nUserid: %s\nprøveeksamen3.Role: %s\n", userloop.getUsername(), userloop.getUserid(), userloop.getRole());
        }
        for (User userloop : user.getUsers(Role.Editor)) {
            System.out.printf("Username: %s\nUserid: %s\nprøveeksamen3.Role: %s\n", userloop.getUsername(), userloop.getUserid(), userloop.getRole());

        }
    }
}

