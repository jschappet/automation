package com.schappet.weight.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import com.schappet.spring.AbstractSpringTestCase;

/**
 * Unit test Template
 * Generated by Protogen
 * @since 04/11/2015 07:34:52 CDT
 */
@WebAppConfiguration
public class VitalsTest extends AbstractSpringTestCase {

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

}