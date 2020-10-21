package serviceImpl;

import entry.Student;
import mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper sm;

    @Override
    public int insert(Student student) {
        int i = sm.insert(student);
        return  i;
    }

    @Override
    public int update(Student student) {
        int i = sm.update(student);
        return  i;
    }

    @Override
    public int delete(int id) {
        int i = sm.delete(id);
        return  i;
    }

    @Override
    public List<Student> selectAll() {
        return sm.selectAll();
    }


}
