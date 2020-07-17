package ru.job4j.ex;

import java.util.Arrays;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User asd = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                asd = users[index];
                break;
            }
        }
        if (asd == null) {
            throw new UserNotFoundException("User not found in arrays");
        }
        return asd;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User Invalid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("NameUser Invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException a) {
            a.printStackTrace();
        } catch (UserNotFoundException b) {
            b.printStackTrace();
        }
    }
}
