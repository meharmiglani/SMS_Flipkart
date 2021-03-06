package com.flipkart.dao;

import com.flipkart.model.Course;

import java.util.List;

public interface CourseCatalogDao {
    List<Course> viewCourseCatalog(int courseId);
    boolean addCourseToCatalog(Course course);
    boolean deleteCourse(int courseId);
    List<Course> viewAllCourses();
}
