package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import bean.User;
import dao.DatabaseDao;
import dao.UserDao;
import service.UserService;

public class UserServiceTest {

	@Test
	public void testregister() throws SQLException {
		UserService userService=new UserService();
		User user=new User();
		int register=userService.register(user);
		assertEquals(register,1);
	}

}
