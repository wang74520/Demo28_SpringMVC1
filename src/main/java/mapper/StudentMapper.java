package mapper;

import entry.Student;

import java.util.List;

public interface StudentMapper {

    int insert(Student student);

    int update(Student student);

    int delete(int id);

    List<Student> selectAll();

}
