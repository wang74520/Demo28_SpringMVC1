package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import entry.MyException;
import entry.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController  //等价于 @Controller + @ResponseBody
public class MyController2 {

    @RequestMapping("/getString")
    public String getString(@RequestParam String name,@RequestParam String age){
        System.out.println(name+" "+age);
        return "hello";
    }

    @RequestMapping("/getStu")
    public Student getStu(){
        Student stu = new Student();
        stu.setId(123);
        stu.setName("张三");
        stu.setGender("男");
        return stu;
    }

    @RequestMapping("/getList")
    public List getList(){
        List<Student> list = new ArrayList<Student>();
        Student stu1 = new Student("张三",111,"20");
        Student stu2 = new Student("李四",112,"24");
        Student stu3 = new Student("王五",113,"28");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        return list;
    }

    @RequestMapping("/getJson")
    public void getJson(@RequestParam String json){
        Student stu = JSON.parseObject(json,Student.class);
        System.out.println(stu);
    }

    @RequestMapping("/getJsonArr")
    public void getJsonArr(@RequestParam String json){
        List<Student> list= JSON.parseArray(json, Student.class);
        System.out.println(list);
        List<Student> list2= JSONArray.parseArray(json, Student.class);
        System.out.println(list2);
        List<Student> list3 = new ArrayList<>(JSON.parseArray(json, Student.class));
        System.out.println(list3);
        List<Student> list4 = new ArrayList<>(JSONArray.parseArray(json, Student.class));
        System.out.println(list4);
    }

    @RequestMapping("/error")
    public String error() throws MyException {
        int a = 0;
        if (a==0){
            throw new MyException("除数为0了");
        }
        int b = 2/a;
        return "my";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) throws MyException {
        System.out.println("我是Controller中的hello");
        return "hello";
    }
}
