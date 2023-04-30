package ir.fa.collage.model;

public class Teacher extends User {

    private Field field;
    private int experience;

    public Teacher(Field field1, int experience1,String name1, String surname1, String username1){
        super(name1,surname1,username1);
        field = field1;
        experience = experience1;

    }

}
