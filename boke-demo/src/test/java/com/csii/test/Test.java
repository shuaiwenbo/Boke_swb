package com.csii.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class Test {
	@Autowired
	DataSource dataSource;
	@org.junit.Test
	public void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());
		Connection connection=dataSource.getConnection();
		System.out.println(connection);
	}
}
