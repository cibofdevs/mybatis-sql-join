package com.example.demo.mapper;

import com.example.demo.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {
    @Select("SELECT * FROM Employee")
    List<Employee> findAll();

    @Select("SELECT e.id, e.name, d.name AS department_name FROM Employee e LEFT JOIN Department d ON e.department_id = d.id")
    List<Map<String, Object>> leftJoin();

    @Select("SELECT e.id, e.name, d.name AS department_name FROM Employee e RIGHT JOIN Department d ON e.department_id = d.id")
    List<Map<String, Object>> rightJoin();

    @Select("SELECT e.id, e.name, d.name AS department_name FROM Employee e INNER JOIN Department d ON e.department_id = d.id")
    List<Map<String, Object>> innerJoin();

    @Select("SELECT e.id, e.name, d.name AS department_name FROM Employee e LEFT JOIN Department d ON e.department_id = d.id UNION SELECT e.id, e.name, d.name AS department_name FROM Employee e RIGHT JOIN Department d ON e.department_id = d.id")
    List<Map<String, Object>> fullJoin();
}
