package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import workdemo.SaleMachine;


public class SaleMachineTest {

	
	@Test
	public void sale_orange_10() {
		SaleMachine sm = new SaleMachine();
		assertEquals("拿好5元，请取走orange", sm.sale("orange", 10));
	}
	
	@Test
	public void sale_beer_10() {
		SaleMachine sm = new SaleMachine();
		assertEquals("拿好5元，请取走beer", sm.sale("beer", 10));
	}
	
	@Test
	public void sale_false_10() {
		SaleMachine sm = new SaleMachine();
		assertEquals("错误指令！", sm.sale("haha", 10));
	}
	
	@Test
	public void sale_fiveNum_false_10() {
		SaleMachine sm = new SaleMachine();
		sm.sale("orange",10);
		sm.sale("orange",10);
		sm.sale("orange",10);
		sm.sale("orange",10);
		sm.sale("orange",10);
		
		assertEquals("没有零钱找，退您10元", sm.sale("beer", 10));
	}
	
	@Test
	public void sale_orange_5() {
		SaleMachine sm = new SaleMachine();
		assertEquals("请取走orange", sm.sale("orange", 5));
	}
	
	@Test
	public void sale_beer_5() {
		SaleMachine sm = new SaleMachine();
		assertEquals("请取走beer", sm.sale("beer", 5));
	}

	@Test
	public void sale_false_5() {
		SaleMachine sm = new SaleMachine();
		assertEquals("错误指令！", sm.sale("haha", 5));
	}
	
	@Test
	public void sale_orange_unenough() {
		SaleMachine sm = new SaleMachine();
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		sm.sale("orange", 5);
		
		assertEquals("很抱歉，没有orange", sm.sale("orange", 5));
	}
	
	@Test
	public void sale_beer_unenough() {
		SaleMachine sm = new SaleMachine();
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		sm.sale("beer", 5);
		
		assertEquals("很抱歉，没有beer", sm.sale("beer", 5));
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
		assertEquals("很抱歉，没有beer", sm.sale("beer", 5));
	}
	
	@Test
	public void sale_false_0() {
		SaleMachine sm = new SaleMachine();
		assertEquals("错误指令！", sm.sale("orange", 0));
	}
	
}
