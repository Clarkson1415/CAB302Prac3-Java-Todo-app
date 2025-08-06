import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService
{
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default users??
    AuthenticationService(ArrayList<User> users)
    {
        this.users = users;
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    @Override
    public User signUp(String username, String password)
    {
        var isUserTaken = false;
        var newUserAdded = new User(username, password);

        // User userWithSameName = users.stream().filter(x -> x.getUsername().equals(username)).findFirst().orElse(null);

        for (var user : users)
        {
            if (Objects.equals(user.getUsername(), newUserAdded.getUsername()))
            {
                isUserTaken = true;
                break;
            }
        }

        return isUserTaken ? null : newUserAdded;
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    @Override
    public User logIn(String username, String password)
    {
        for (User user : users){
            if ((Objects.equals(user.getUsername(), username)) && (Objects.equals(user.getPassword(), password)))
            {
                return user;
            }
        }

        return null;
    }
}

