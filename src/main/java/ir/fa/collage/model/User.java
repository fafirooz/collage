package ir.fa.collage.model;

public class User {

    protected String name;
    protected String surname;
    protected String username;

    public User(String name1, String surname1, String username1) {
        name = name1;
        surname = surname1;
        username = username1;
    }

    public void print() {
        System.out.println(name + " " + surname + " " + username);
    }


}
