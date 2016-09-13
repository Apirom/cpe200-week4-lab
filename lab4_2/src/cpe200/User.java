package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public boolean setUserName(String name) {
        String pattern = "([A-Za-z]+)([A-Za-z\\d]+)";
        if(name.matches(pattern) && name.length() >=8)
        {
            this.userName = name;
            return true;
        }else {
            return false;
        }
    }

    public boolean setPassword(String name) {
        if(name.length()>=12)
        {
            if(name.matches("([\\D]+)"))
            {
                return false;
            }else if(name.matches("([^a-z]+)"))
            {
                return false;
            }else if(name.matches("([^A-Z]+)"))
            {
                return false;
            }else
            {
                this.password = name;
                return true;
            }
        }else
        {
            return false;
        }
    }

    public String getUserName() {   return this.userName;  }

    public String getPassword() {
        return this.password;
    }
}
