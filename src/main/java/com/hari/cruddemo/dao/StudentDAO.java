package com.hari.cruddemo.dao;

import com.hari.cruddemo.entity.Student;

public interface StudentDAO {


    void save(Student student);

    Student findById(Integer id);
}
