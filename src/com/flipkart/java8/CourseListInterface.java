package com.flipkart.java8;

import com.flipkart.dao.CourseCatalogDaoImpl;
import com.flipkart.model.Course;
import org.apache.log4j.Logger;

import java.util.List;

public interface CourseListInterface {
    Logger logger = Logger.getLogger(CourseListInterface.class);
    CourseCatalogDaoImpl courseCatalogDao = new CourseCatalogDaoImpl();

    default void viewCourseListCatalog() {
        List<Course> catalogList = courseCatalogDao.viewCourseCatalog();
        if (catalogList != null) {
            logger.info("\n");
            logger.info("********* CATALOG ************");
            catalogList.forEach((course) -> logger.info(course.getCourseId() + "   " + course.getCourseName() + "  " + course.getProfessorName() + "  " + course.getCredits()));
            logger.info("******************************");
        } else {
            logger.error("Course Catalog couldn't be fetched");
        }
    }
}