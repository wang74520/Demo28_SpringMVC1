package service;

import entry.Student;

import java.util.List;

public interface StudentService {

    int insert(Student student);

    int update(Student student);

    int delete(int id);

    List<Student> selectAll();
}
