package org.katheer.test;

import org.katheer.dao.EmployeeDao;
import org.katheer.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource" +
                "/applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");

        Employee employee = new Employee();
        employee.setEid(111);
        employee.setEname("AAA");
        employee.setEsal(7000);
        employee.setEaddr("Chn");

        System.out.println(employeeDao.add(employee));
    }
}
