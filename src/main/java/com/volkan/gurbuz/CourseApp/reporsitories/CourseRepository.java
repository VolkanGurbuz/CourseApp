package com.volkan.gurbuz.CourseApp.reporsitories;

import com.volkan.gurbuz.CourseApp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CourseRepository  extends JpaRepository<Course, BigInteger> {
}
