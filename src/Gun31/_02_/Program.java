package Gun31._02_;

public class Program {
    public static void main(String[] args) {
        User user1=new User("İsmet",Role.ADMIN,Status.AKTIF);
        User user2=new User("mehmet",Role.MUDUR,Status.PASIF);
        User user3=new User("Ayşe",Role.SATIS,Status.AKTIF);


        User.Usersil(user1);// admin silinemez
        User.Usersil(user2);// user silindi
        User.Usersil(user3);// user silindi






    }
}
