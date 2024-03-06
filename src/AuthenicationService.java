import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class AuthenicationService implements IAuthenticationService {
    private ArrayList<User> users;

        // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenicationService(){
        users.add(new User("test", "test"));
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    @Override
    public User signUp(String username, String password){
        Iterator i = users.iterator();
        while(i.hasNext()) {
            User existsAlready = (User) i.next();
            if (existsAlready.getUsername().equals(username)){
                return null;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    @Override
    public User logIn(String username, String password){
        Iterator i = users.iterator();
        while(i.hasNext()) {
            User user = (User) i.next();
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
