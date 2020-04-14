/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.CardAttributes.suit.CLUBS;
import static ca.sheridancollege.project.CardAttributes.suit.DIAMONDS;
import static ca.sheridancollege.project.CardAttributes.value.TWO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author taipan
 */
public class CardAttributesTest {
    
    public CardAttributesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of getSuit method, of class CardAttributes.
     */
    @Test
    public void testGetSuitGood() {
        System.out.println("getSuit");
        CardAttributes instance = null;
        CardAttributes.suit expResult = instance.getSuit();
        CardAttributes.suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetSuitBad() {
        System.out.println("getSuit");
        CardAttributes instance = null;
        CardAttributes.suit expResult = null;
        CardAttributes.suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetSuitBoundary() {
        System.out.println("getSuit");
        CardAttributes instance = null;
        CardAttributes.suit expResult = null;
        CardAttributes.suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSuit method, of class CardAttributes.
     */
    @Test
    public void testSetSuitGood() {
        System.out.println("setSuit");
        CardAttributes.suit suit = CLUBS;
        CardAttributes instance = new CardAttributes(CLUBS, TWO);
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testSetSuitBad() {
        System.out.println("setSuit");
        CardAttributes.suit suit = null;
        CardAttributes instance = null;
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testSetSuitBoundary() {
        System.out.println("setSuit");
        CardAttributes.suit suit = null;
        CardAttributes instance = null;
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class CardAttributes.
     */
    @Test
    public void testGetValueGood() {
        System.out.println("getValue");
        CardAttributes instance = new CardAttributes(DIAMONDS, TWO);
        CardAttributes.value expResult = instance.getValue();
        CardAttributes.value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetValueBad() {
        System.out.println("getValue");
        CardAttributes instance = new CardAttributes(null, null);
        CardAttributes.value expResult = null;
        CardAttributes.value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetValueBoundary() {
        System.out.println("getValue");
        CardAttributes instance = null;
        CardAttributes.value expResult = null;
        CardAttributes.value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class CardAttributes.
     */
    @Test
    public void testSetValueGood() {
        System.out.println("setValue");
        CardAttributes.value value = TWO;
        CardAttributes instance = new CardAttributes(CLUBS, TWO);
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testSetValueBad() {
        System.out.println("setValue");
        CardAttributes.value value = TWO;
        CardAttributes instance = new CardAttributes(null, null);
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testSetValueBoundary() {
        System.out.println("setValue");
        CardAttributes.value value = null;
        CardAttributes instance = null;
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CardAttributes.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toString");
        CardAttributes instance = new CardAttributes(CLUBS, TWO);
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testToStringBad() {
        System.out.println("toString");
        CardAttributes instance = new CardAttributes(null, null);
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testToStringBoundary() {
        System.out.println("toString");
        CardAttributes instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
