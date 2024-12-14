import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos usuarios
        UserEntity user1 = new UserEntity(1, "John", "Doe");
        UserEntity user2 = new UserEntity(2, "Jane", "Smith");

        // Crear una lista de usuarios
        List<UserEntity> userList = Arrays.asList(user1, user2);

        // Crear una instancia de UserService con la lista de usuarios
        UserService userService = new UserService(userList);

        // Obtener y mostrar los nombres de los usuarios
        String[][] userNames = userService.getUsers();
        for (String[] userName : userNames) {
            System.out.println(userName[0]);
        }
    }
}