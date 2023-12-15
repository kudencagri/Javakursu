package Gun31._02_;
public class User {
    String username;
    Role role;
    Status statu;

    public static void Usersil(User user){
        if (user.role==Role.ADMIN)
            System.out.println("Admin silemez");
        else       {
            System.out.println("user silindi");
        }
    }

    public User(String username, Role role, Status statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
