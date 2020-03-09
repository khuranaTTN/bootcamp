package com.ttn.bootcamp.Exercises;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class StudentConsumer
{
@Reference
    StudentServices studentServices;
}
