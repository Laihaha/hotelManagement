package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import workdemo.SaleMachine;


public class SaleMachineTest {

	
	@Test
	public void sale_orange_10() {
		SaleMachine sm = new SaleMachine();
		assertEquals("�ú�5Ԫ����ȡ��orange", sm.sale("orange", 10));
	}
	
	@Test
	public void sale_beer_10() {
		SaleMachine sm = new SaleMachine();
		assertEquals("�ú�5Ԫ����ȡ��beer", sm.sale("beer", 10));
	}
	
	@Test
	public void sale_false_10() {
		SaleMachine sm = new SaleMachine();
		assertEquals("����ָ�", sm.sale("haha", 10));
	}
	
	@Test
	public void sale_fiveNum_false_10() {
		SaleMachine sm = new SaleMachine();
		sm.sale("orange",10);
		sm.sale("orange",10);
		sm.sale("orange",10);
		sm.sale("orange",10);
		sm.sale("orange",10);
		
		assertEquals("û����Ǯ�ң�����10Ԫ", sm.sale("beer", 10));
	}
	
	@Test
	public void sale_orange_5() {
		SaleMachine sm = new SaleMachine();
		assertEquals("��ȡ��orange", sm.sale("orange", 5));
	}
	
	@Test
	public void sale_beer_5() {
		SaleMachine sm = new SaleMachine();
		assertEquals("��ȡ��beer", sm.sale("beer", 5));
	}

	@Test
	public void sale_false_5() {
		SaleMachine sm = new SaleMachine();
		assertEquals("����ָ�", sm.sale("haha", 5));
	}
	
	@Test
	public void sale_orange_unenough() {
		SaleMachine sm = new SaleMachine();
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		
		assertEquals("�ܱ�Ǹ��û��orange", sm.sale("orange", 5));
	}
	
	@Test
	public void sale_beer_unenough() {
		SaleMachine sm = new SaleMachine();
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		
		assertEquals("�ܱ�Ǹ��û��beer", sm.sale("beer", 5));
	}
	
	@Test
	public void sale_both_unenough() {
		SaleMachine sm = new SaleMachine();
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		assertEquals("�ܱ�Ǹ��û��beer", sm.sale("beer", 5));
	}
	
	@Test
	public void sale_false_0() {
		SaleMachine sm = new SaleMachine();
		assertEquals("����ָ�", sm.sale("orange", 0));
	}
	
}
