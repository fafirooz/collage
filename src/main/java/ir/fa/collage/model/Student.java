package ir.fa.collage.model;

public class Student extends User {

    // const
    private final static int LESSON_COUNT = 10;
    private final static int BASE_COUNTER = 0;

   private int age;
   private boolean scholarship;
   private Lesson[] lessons; // private List<> lessons= new ArrayList<>();
   private int counter; //Delete when use arraylist

   public Student(int age1, boolean scholarship1, String name1, String surname1, String username1){ //conductor
       super(name1, surname1, username1);
       age = age1;
       scholarship = scholarship1;
       this.lessons = new Lesson[LESSON_COUNT];
       this.counter = BASE_COUNTER;

    //   username = username1;
    // name = name1;
    // surname = surname1;
   }

    // overload = difference in optional and mandatory

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

    public Lesson[] getLessons() {
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        lessons[counter] = lesson; // addLesson.ArrayList<>();
        counter++;
    }
}
