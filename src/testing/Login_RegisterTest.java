package testing;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hotel.Login_Register;

public class Login_RegisterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//1
	@Test
	public void test_1() throws Exception {
		Login_Register lr = new Login_Register();
		
		assertEquals("注册成功!",lr.register("林凡","123456"));
	}
	
	//2
	@Test
	public void test_2() throws Exception {
		Login_Register lr = new Login_Register();
		
		lr.register("林凡","123456");
		assertEquals("注册失败!",lr.register("林凡","123456"));
	}
	//3
	@Test
	public void test_3() throws Exception {
		Login_Register lr = new Login_Register();
		
		lr.register("林凡","123456");
		assertEquals("登录成功!",lr.login("林凡","123456"));
	}
	
	//4
	@Test
	public void test_4() throws Exception {
		Login_Register lr = new Login_Register();
		
		lr.register("林凡","123456");
		assertEquals("登录失败!",lr.login("老王","123456"));
	}
	

	
	
}
