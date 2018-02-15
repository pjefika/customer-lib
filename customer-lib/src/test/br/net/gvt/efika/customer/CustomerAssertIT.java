/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer;

import br.net.gvt.efika.customer.model.customer.CustomerAssert;
import br.net.gvt.efika.customer.model.customer.asserts.AssertsEnum;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class CustomerAssertIT {

    public CustomerAssertIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAsserts method, of class CustomerAssert.
     */
    @Test
    public void testGetAsserts() {
        System.out.println("getAsserts");
        CustomerAssert instance = new CustomerAssert(AssertsEnum.ATT_DOWN_OK, Boolean.FALSE);
        System.out.println("end");
        assertTrue(instance.getCreationDate() != null);
    }

    /**
     * Test of getValue method, of class CustomerAssert.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        CustomerAssert instance = new CustomerAssert();
        Boolean expResult = null;
        Boolean result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsserts method, of class CustomerAssert.
     */
    @Test
    public void testSetAsserts() {
        System.out.println("setAsserts");
        AssertsEnum asserts = null;
        CustomerAssert instance = new CustomerAssert();
        instance.setAsserts(asserts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class CustomerAssert.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Boolean value = null;
        CustomerAssert instance = new CustomerAssert();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class CustomerAssert.
     */
    @Test
    public void testEquals_Object() {
        System.out.println("equals");
        Object obj = null;
        CustomerAssert instance = new CustomerAssert();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class CustomerAssert.
     */
    @Test
    public void testEquals_CustomerAssert() {
        System.out.println("equals");
        CustomerAssert dev = null;
        CustomerAssert instance = new CustomerAssert();
        boolean expResult = false;
        boolean result = instance.equals(dev);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
