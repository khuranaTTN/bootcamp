package com.ttn.bootcamp.Exercises;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import java.util.List;

@Component(service = ClassService.class, immediate = true)
@Designate(ocd = StudentConfiguration.class)
public class ClassConfigurationService implements ClassService {
    private int marksRequired;
    private int allowedStudents;
    @Activate
    public void activate (StudentConfiguration studentConfiguration){


        marksRequired = studentConfiguration.getMarksRequired();
        allowedStudents = studentConfiguration.getAllowedStudents();


    }
    public boolean isClassLimitReached(List studentList){
        if(studentList.isEmpty()){
            return true;
        }
        if(studentList.size()<allowedStudents){
            return true;
        }
        return false;
    }

    public int getPassingMarks(){
        return marksRequired ;
    }

}



