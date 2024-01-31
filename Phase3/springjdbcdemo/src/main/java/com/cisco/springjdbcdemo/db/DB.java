package com.cisco.springjdbcdemo.db;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cisco.springjdbcdemo.model.Dish;

public class DB {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	public DB() {}
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate= new JdbcTemplate(dataSource);
		System.out.println("[DB] setter injection done on"
				+ " Datasource and initialized JDBC Template");
	}
	public void insertDish(Dish dish) {
		String sql="insert into dish values (null,?,?)";
		int result=jdbcTemplate.update(sql,dish.getName(),dish.getPrice());
		if(result>0) {
			System.out.println("Dish Inserted in Table");
		}else {
			System.out.println("Error while inserting Data");
		}
	}
}
