import java.util.List;

public class UserService {

    public List<UserEntity> users;

    public UserService(List<UserEntity> users) {
        this.users = users;
    }

    public String[][] getUsers() {
        String[][] userNames = new String[users.size()][1];
        for (int i = 0; i < users.size(); i++) {
            userNames[i][0] = users.get(i).getName();
            System.out.println(users.get(i).getName());
        }
        return userNames;
    }

}