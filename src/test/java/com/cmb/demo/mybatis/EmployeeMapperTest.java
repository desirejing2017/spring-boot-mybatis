package com.cmb.demo.mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cmb.demo.mybatis.entity.Employee;
import com.cmb.demo.mybatis.mapper.EmployeeMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeMapperTest {

	@Autowired
	private EmployeeMapper emmDao;
	
	@Test
	public void findAll() {
		List<Employee> list = emmDao.findAll();
		for(Employee e:list) {
			System.out.println(e.toString());
		}
	}
	
	@Test
	public void findByName() {
		List<Employee> list = emmDao.findByName("admin");
		for(Employee e:list) {
			System.out.println(e.toString());
		}
	}
}
