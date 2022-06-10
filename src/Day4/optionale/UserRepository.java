package Day4.optionale;

import java.util.Optional;

public interface UserRepository {

    void addUser(User user);

    User findUser(String name);

    Optional<User> findUserByName(String name);


}
