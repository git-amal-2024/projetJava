import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {

        users.add(user);
    }

    public void removeUser(String permis) {
        users.removeIf(user -> user.getPermis().equals(permis));
    }

    public List<User> searchUsers(String nom, String permis) {
        return users.stream()
                .filter(user -> (nom == null || user.getNom().equals(nom)) &&
                        (permis == null || user.getPermis().equals(permis)))
                .collect(Collectors.toList());
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}
