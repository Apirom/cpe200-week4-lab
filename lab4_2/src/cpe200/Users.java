package cpe200;

import javax.xml.transform.Templates;
import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList=new ArrayList<User>();
    public void addUser(User user)
    {
       this.userList.add(user);
    }

    public void addUser(String userName, String password)
    {
    }

    public void deleteUser(User user)
    {
        this.userList.remove(user);
    }

    public boolean exists(User user)
    {
        for(int i=0; i<this.userList.size();i++)
        {
            if(this.userList.get(i) == user)
            {
                return true;
            }
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (int i = 0; i <this.userList.size() ; i++) {
            if(this.userList.get(i).userName == userName)
            {
                return this.userList.get(i);
            }
        }
        return null;
    }

    public int count()
    {
        return this.userList.size();
    }

    public User[] getUserArray()
    {
        User[] user=new User[this.userList.size()];
        for(int i=0;i<this.userList.size();i++)
        {
            user[i]=this.userList.get(i);
        }

        return user;
    }
}
