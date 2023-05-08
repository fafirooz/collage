package ir.fa.collage.repository;

import ir.fa.collage.model.Teacher;

import java.util.ArrayList;

public class InMemoryTeacherRepository implements TeacherRepository {

    /*private experience;
    private Field;*/

    private ArrayList teacherlist;

    public InMemoryTeacherRepository() {

        teacherlist = new ArrayList();
    }

    @Override
    public void save (Teacher teacher){
        teacherlist.add(teacher);

    }
}
