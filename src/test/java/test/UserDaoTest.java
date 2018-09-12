package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import bean.User;
import dao.DatabaseDao;
import dao.UserDao;
import tools.PageInformation;

public class UserDaoTest {

	@Test
	public void testhasUser() throws SQLException {
		UserDao userDao=new UserDao();
		User user=new User();
		DatabaseDao databaseDao=new DatabaseDao();
		boolean a=userDao.hasUser(user, databaseDao);
		assertTrue(a);	
	}
	
	@Test
	public void testregister() throws SQLException {
		UserDao userDao=new UserDao();
		User user=new User();
		DatabaseDao databaseDao=new DatabaseDao();
		int register=userDao.register(user, databaseDao);
		assertEquals(register,1);
	}
	
	@Test
	public void testlogin() throws Exception {
		UserDao userDao=new UserDao();
		User user=new User();
		DatabaseDao databaseDao=new DatabaseDao();
		int login=userDao.login(user);
		assertEquals(login,1);
	}
	
	@Test
	public void testgetOnePage() throws SQLException {
		UserDao userDao=new UserDao();
		PageInformation pageInformation=new PageInformation();
		DatabaseDao databaseDao=new DatabaseDao();
		List<User> user=userDao.getOnePage(pageInformation, databaseDao);
		assertNotNull(user);	
	}
	
	@Test
	public void testchangeEnable() throws SQLException {
		UserDao userDao=new UserDao();
		DatabaseDao databaseDao=new DatabaseDao();
		String id="30";
		int a=userDao.changeEnable(id, databaseDao);
		assertEquals(a,1);
	}
	
	@Test
	public void testdeletes() throws SQLException {
		UserDao userDao=new UserDao();
		User user=new User();
		DatabaseDao databaseDao=new DatabaseDao();
		String ids="30";
		int a=userDao.deletes(ids, databaseDao);
		assertEquals(a,1);
	}
	
	@Test
	public void testupdateHeadIcon() throws SQLException {
		UserDao userDao=new UserDao();
		User user=new User();
		DatabaseDao databaseDao=new DatabaseDao();
		int a=userDao.updateHeadIcon(user, databaseDao);
		assertEquals(a,1);
	}
}
