package com.cmb.demo.mybatis.mapper.sql;

import org.apache.ibatis.jdbc.SQL;

public class EmployeeMapperSql {
	public String findAll() {
		return new SQL() {{
			SELECT("*");
			FROM("employee");
		}}.toString();
	}
	
	public String findByName() {
		return new SQL() {{
			SELECT("*");
			FROM("employee");
			WHERE("name=#{name}");
		}}.toString();
	}
}
