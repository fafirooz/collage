package ir.fa.collage.model;

public class Student extends User {

   private int age;
   private boolean scholarship;

   private Lesson[] lessons;

   public Student(int age1, boolean scholarship1, String name1, String surname1, String username1){ //conductor
       super(name1, surname1, username1);
       age = age1;
       scholarship = scholarship1;

    //   username = username1;
    // name = name1;
    // surname = surname1;
   }

    // overload = difference in optional and mandatory
    public Student(String name1, String surname1, String username1){
        super(name1, surname1, username1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }
}
