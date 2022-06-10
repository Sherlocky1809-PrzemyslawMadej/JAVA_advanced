package Day4.optionale;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User findUser(String name) {
        for (User user: users) {
            if(user.getName().equals(name)) {
                return user;
            }
        }
        return null;
        // moglibysmy tu wrzucic wyjatek np. NoUserNotFoundException
    }

    @Override
    public Optional<User> findUserByName(String name) {
        for (User user: users) {
            if(user.getName().equals(name)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
