package com.cmb.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;

import com.cmb.demo.mybatis.entity.Employee;
import com.cmb.demo.mybatis.mapper.sql.EmployeeMapperSql;

@Component
@Mapper
public interface EmployeeMapper {
	@SelectProvider(type=EmployeeMapperSql.class,method="findAll")
	@Results({
		@Result(column="post_id",property="postId"),
		@Result(column="stand_id",property="standId")
	})
	List<Employee> findAll();
	
	//可以sql注入
	@Results({
		@Result(column="post_id",property="postId"),
		@Result(column="stand_id",property="standId")
	})
	@SelectProvider(type=EmployeeMapperSql.class,method="findByName")
	List<Employee> findByName(@Param(value = "name") String name);
}
