package ir.fa.collage.service;

import ir.fa.collage.model.Teacher;

public class LocalTeacherService implements TeacherService{

    private LocalTeacherService localTeacherService;

    public LocalTeacherService(LocalTeacherService localTeacherService){
        this.localTeacherService = localTeacherService;

    }
    public void save (Teacher teacher){
        localTeacherService.save(teacher);
    }
    @Override
    public void bussiness (){

    }
}
