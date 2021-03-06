package com.schappet.weight.dao;

import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import com.schappet.spring.AbstractSpringTestCase;
import com.schappet.weight.domain.Activity;
import com.schappet.weight.domain.Person;

/**
 * Unit test Template
 * Generated by Protogen
 * @since 04/11/2015 07:34:52 CDT
 */
@WebAppConfiguration
public class ActivityTest extends AbstractSpringTestCase {

    @Autowired
    private WeightDaoService weightDaoService;

    @Test
    public void testServiceName() {
    	assertEquals( true, true );
    }

    @Before
    public void setUp() throws Exception {
    	super.setUp();
    }

    @After
    public void tearDown() throws Exception {
    	super.tearDown();
    }

    
    

	private final String TEST0 = "3/1/2015,11410,4.7,miles,1404,11001.2";
	private final String TEST1 = "3/16/2015,15632,6.4,miles,1970.8,13398.8";
	private final String TEST2 = "3/17/2015,13602,5.5,miles,1458,13878";
	private final String BAD_DATE="Date,Activity,Miles,units,Points,5DayAverage";
	
	private final int PERSON_ID = 1;
	
	private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Test
	public void testDateTest2( ) throws Exception {
		
    	Person defaultPerson = weightDaoService.getPersonService().findById(PERSON_ID);

		Activity test1 = new Activity(TEST2, defaultPerson);
		String date = sdf.format(test1.getActivityDate());
		assertEquals("Date is wrong", "2015-03-17", date);
	}
	
	@Test
	public void testDateTest1( ) throws Exception {
		Person defaultPerson = weightDaoService.getPersonService().findById(PERSON_ID);

		Activity test1 = new Activity(TEST1, defaultPerson);
		String date = sdf.format(test1.getActivityDate());
		assertEquals("Date is wrong", "2015-03-16", date);
	}

	
	@Test
	public void testDateTest0( ) throws Exception {
		Person defaultPerson = weightDaoService.getPersonService().findById(PERSON_ID);

		Activity test1 = new Activity(TEST0, defaultPerson);
		String date = sdf.format(test1.getActivityDate());
		assertEquals("Date is wrong", "2015-03-01", date);
	}
//
//	@Test(expected = NumberFormatException.class)  
//	public void testBadDate( ) {
//		Activity test1= null;
//		try {
//			 test1 = new Activity(BAD_DATE, PERSON_ID);			
//		} catch (NumberFormatException nfe) {
//			
//		}
//		assertNull("Should be null", test1);
//		
//	}

	
	
	@Test
	public void testValue( ) throws Exception {
		Person defaultPerson = weightDaoService.getPersonService().findById(PERSON_ID);

		Activity test1 = new Activity(TEST0, defaultPerson);
		
		assertEquals("Value is wrong", "1404", test1.getValue());
	}

}