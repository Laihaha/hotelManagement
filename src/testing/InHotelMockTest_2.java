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
			will(onConsecutiveCalls(returnValue("Mary成功入住701房间！"),returnValue("该房间已经有人入住")));
		}});
	}
	@Test
	public void test() {
		assertEquals("Mary成功入住701房间！",ih.in(701, "Mary"));
		assertEquals("该房间已经有人入住",ih.in(701, "Mary"));
	}

}
