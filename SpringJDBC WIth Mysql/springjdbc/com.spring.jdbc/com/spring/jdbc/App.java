package com.spring.jdbc;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started........" );
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the id number = ");
        int id=sc.nextInt();
	       ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
	      JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
	      
	      // insert query
//	      String query="insert into student(id,name,city) values(?,?,?)";
//	      int result = template.update(query,3,"Anish saifi","Bahorawas");
	      
	      // update query
//	      String query="update student set city=? where id=?";
//	      int result = template.update(query,"Khurja",1);
	      
	      // delect query
//	      String query="delete from student where id=?";
//	      int result=template.update(query,2);
	      
	      // fatch data
	    
	      String query="select *from student where id =?";
	      student student1= template.queryForObject(query,new Object[] {id}, new BeanPropertyRowMapper<>(student.class)); 
	      System.out.println("fatch data..\n"+ student1);
	      
	      // fatch all data from database 
	      
//	      String query="select *from student";
//	      List<student> student1=template.query(query,new BeanPropertyRowMapper<>(student.class));
//	      System.out.println("data fatch.."+ student1);
	      
 	      
    }
}
