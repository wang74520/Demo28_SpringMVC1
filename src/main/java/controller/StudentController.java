package controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import entry.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;

    @RequestMapping("/insert")
    public int insert(){
        Student student = new Student("tom",20,"男");
        return ss.insert(student);
    }

    @RequestMapping("/update")
    public int update(@Param("id") Integer id,@Param("name") String name,
                      @Param("age") Integer age,@Param("gender") String gender){
        Student student = new Student(id,name,age,gender);
        return ss.update(student);
    }

    @RequestMapping("/delete")
    public int delete(@Param("id") Integer id){
        return ss.delete(id);
    }

    @RequestMapping("/selectAll")
    public List<Student> selectAll(){
        List<Student> list = ss.selectAll();
        return list;
    }
}
