package prøveeksamen3;

public class User {
    private String username;
    private int userid;
    Role role;
    public User(String username, Role role){
        this.username = username;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }
    public void setUserid (int id){
        this.userid = id;
    }
}
