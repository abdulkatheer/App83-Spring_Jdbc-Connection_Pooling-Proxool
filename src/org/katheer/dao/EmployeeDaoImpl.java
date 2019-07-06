package org.katheer.dao;

import org.katheer.dto.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String add(Employee employee) {
        String query = "INSERT INTO employee VALUES(?,?,?,?)";

        try {
            int rowCount = jdbcTemplate.update(query, employee.getEid(), employee.getEname(),
                    employee.getEsal(), employee.getEaddr());
            if (rowCount == 1) {
                return "Employee inserted successfully";
            } else {
                return "Employee insertion failed";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Employee insertion failed";
        }


    }
}
