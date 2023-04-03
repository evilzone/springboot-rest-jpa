package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(123, "Java course", "this course contains basic of java"));
    }

    @java.lang.Override
    public List<Course> getCourses() {
        return new ArrayList<>();
    }
}
