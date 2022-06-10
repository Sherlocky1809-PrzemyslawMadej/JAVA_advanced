package Day4.optionale;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        UserRepository repository = new UserRepositoryImpl();
        User user = new User("Rambo", "admin007");
        repository.addUser(user);
        System.out.println(repository.findUser("Rambo"));
        System.out.println(repository.findUser("Terminator"));

        User randomUser = repository.findUser("randomUser");
//        randomUser.getName() istnieje ryzyko NullPointerException
//        userList.remove(randomUser) tu nie ma ryzyka, gdyz po prostu wtedy nic sie nie usunie

        if(randomUser != null) {
            // do something
//            logika dopiero po sprawdzeniu czy nie ma nulla
        } else {
//            musimy sie zastanowic co jesli jest null
        }

//        Optional
        Optional<User> rambo = repository.findUserByName("Rambo");
        if(rambo.isPresent()) {
            User userRambo = rambo.get();
            System.out.println(userRambo);
        }
    }
}
