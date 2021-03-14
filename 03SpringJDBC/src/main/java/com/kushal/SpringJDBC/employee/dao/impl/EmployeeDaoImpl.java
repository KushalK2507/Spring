package com.kushal.SpringJDBC.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.kushal.SpringJDBC.employee.dao.EmployeeDao;
import com.kushal.SpringJDBC.employee.dao.rowMapper.EmployeeRowMapper;
import com.kushal.SpringJDBC.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcOperations jdbcTemplate;

	@Override
	public int create(Employee employee) {

		String sql = "insert into employee values (?,?,?)";
		return jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, " + "lastname=? where id=?";
		return jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}

	@Override
	public List<Employee> readall() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		return jdbcTemplate.query(sql, rowMapper);
	}

	public JdbcOperations getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcOperations jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
