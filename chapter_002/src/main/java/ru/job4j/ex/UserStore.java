package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User findUser = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                findUser = user;
            }
        }
        if (findUser == null) {
            throw new UserNotFoundException("User not found");
        }
        return findUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Invalid user");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", false)
        };
        try {
            User user = findUser(users, "Petуr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("Ошибка! " + e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден! " + e.getMessage());
        }

    }
}
