package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import bean.Userinformation;
import dao.DatabaseDao;
import dao.UserinformationDao;

public class UserinformationDaoTest {

	@Test
	public void testgetByUserId() throws SQLException {
		UserinformationDao userinformationDao=new UserinformationDao();
		DatabaseDao databaseDao=new DatabaseDao();
		int id=30;
		Userinformation userinformation=userinformationDao.getByUserId(id, databaseDao);
		assertNotNull(userinformation);	
	}
	
	@Test
	public void testupdate() throws SQLException {
		UserinformationDao userinformationDao=new UserinformationDao();
		DatabaseDao databaseDao=new DatabaseDao();
		Userinformation userinformation=new Userinformation();
		userinformation.setUserId(31);userinformation.setSex("男");userinformation.setHobby("打篮球");
		int a=userinformationDao.update(userinformation, databaseDao);
		assertEquals(a,1);
	}
	
	@Test
	public void testinsert() throws SQLException {
		UserinformationDao userinformationDao=new UserinformationDao();
		DatabaseDao databaseDao=new DatabaseDao();
		Userinformation userinformation=new Userinformation();
		userinformation.setUserId(31);userinformation.setSex("女");userinformation.setHobby("打篮球");
		int a=userinformationDao.insert(userinformation, databaseDao);
		assertEquals(a,1);
	}
	
	@Test
	public void testhasUserId() throws SQLException {
		UserinformationDao userinformationDao=new UserinformationDao();
		int id=30;
		DatabaseDao databaseDao=new DatabaseDao();
		boolean a=userinformationDao.hasUserId(id, databaseDao);
		assertTrue(a);	
	}
}
