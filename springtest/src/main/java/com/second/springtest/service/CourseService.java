package com.second.springtest.service;

import com.second.springtest.entity.Course;

import java.util.List;

public interface CourseService {

    //We are doing this for loose coupling.
    public List<Course> getCourses();

    public Course getCourseId(long courseID);

    public Course addCourse(Course course);

    public void deleteCourse(long courseID);
}
