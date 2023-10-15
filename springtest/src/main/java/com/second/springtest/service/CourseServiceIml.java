package com.second.springtest.service;

import com.second.springtest.dao.CourseDao;
import com.second.springtest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceIml implements CourseService {
//    List<Course> list;

    @Autowired
    private CourseDao courseDao;

    //Static data for now.


    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourseId(long courseID) {
       /* Course c = null;
        for (Course course : list) {
            if (course.getId() == courseID) {
                c = course;
                break;
            }
        }*/
        return courseDao.getReferenceById(courseID);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseID) {
        //DELETE METHOD IS ALWAYS THE CRUCIAL + VERY TRICKY TO HANDLE AND IMPORTANT.
//        list = this.list.stream().filter(e -> e.getId() != courseID).collect(Collectors.toList());
        Course entity = courseDao.getReferenceById(courseID);
        courseDao.delete(entity);
    }
}
