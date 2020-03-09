package com.ttn.bootcamp.Exercises;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Services.StudentConfiguration", description = "This file for configuration")
public @interface StudentConfiguration {
    @AttributeDefinition(type = AttributeType.INTEGER, description = "Number Of Students Allowed")
    int getAllowedStudents() default 25 ;

    @AttributeDefinition(type = AttributeType.DOUBLE, description = "Marks Required")
    int getMarksRequired() default 75 ;
}
