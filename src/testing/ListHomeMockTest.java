package testing;

import static org.junit.Assert.*;

import org.jmock.*;
import org.junit.Before;
import org.junit.Test;

import hotel.HotelConstant;
import hotel.IData;
import hotel.ListHome;

public class ListHomeMockTest {

	private Mockery context = new Mockery();
	private IData iData = null;
	private ListHome lh = null;
	
	@Before
	public void setUp() throws Exception {
		iData = context.mock(IData.class);
		lh = new ListHome(iData);
		
		context.checking(new Expectations() {
			{
				
				for(int i=0;i < HotelConstant.HOTEL_TOTAL_FLOOR;i++) {
					for (int j = 0; j < HotelConstant.HOTEL_ROOMS_EVERYFLOOR; j++) {
						
						allowing(iData).getStation( (i+1)*100+j+1 );
						will(returnValue("EMPTY"));		
					}
				}
				
			}
		});
		
		
	}

	@Test
	public void test() {
		
	}

}
