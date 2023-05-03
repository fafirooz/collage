package ir.fa.collage.Service;

import ir.fa.collage.Repository.TeacherRepository;
import ir.fa.collage.model.Teacher;

public class LocalTeacherService implements TeacherService{

    private LocalTeacherService localTeacherService;

    public LocalTeacherService(LocalTeacherService localTeacherService){
        this.localTeacherService = localTeacherService;

    }
    public void save (Teacher teacher){
        TeacherRepository.save(teacher);
    }
    @Override
    public void bussiness (){

    }
}
