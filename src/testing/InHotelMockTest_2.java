package testing;

import static org.junit.Assert.*;

import org.jmock.*;
import org.junit.Before;
import org.junit.Test;

import hotel.IData;
import hotel.InHotel;

public class InHotelMockTest_2 {

	private Mockery context = new Mockery();
	private IData iData = null;
	private InHotel ih = null;
	
	
	@Before
	public void setUp() throws Exception {
		iData = context.mock(IData.class);
		ih = new InHotel(iData);

		
		context.checking( new Expectations() {{
			allowing(iData).in_Out_Room(701, "Mary");
			will(onConsecutiveCalls(returnValue("Mary�ɹ���ס701���䣡"),returnValue("�÷����Ѿ�������ס")));
		}});
	}
	@Test
	public void test() {
		assertEquals("Mary�ɹ���ס701���䣡",ih.in(701, "Mary"));
		assertEquals("�÷����Ѿ�������ס",ih.in(701, "Mary"));
	}

}
