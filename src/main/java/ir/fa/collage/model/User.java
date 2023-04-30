package ir.fa.collage.model;

public class User {

    protected String name;
    protected String surname;
    protected String username;

    private Lesson[] lessons;

    public User(String name1, String surname1, String username1) {
        name = name1;
        surname = surname1;
        username = username1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void print() {
        System.out.println(name + " " + surname + " " + username);
    }


}
