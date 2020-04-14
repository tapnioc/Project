/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.CardAttributes.suit.CLUBS;
import static ca.sheridancollege.project.CardAttributes.value.TWO;
import java.util.ArrayList;
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
public class CardHandTest {
    
    public CardHandTest() {
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
     * Test of getCards method, of class CardHand.
     */
    @Test
    public void testGetCardsGood() {
        System.out.println("getCards");
        CardHand instance = new CardHand();
        ArrayList<CardAttributes> expResult = instance.getCards();
        ArrayList<CardAttributes> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetCardsBad() {
        System.out.println("getCards");
        CardHand instance = new CardHand();
        ArrayList<CardAttributes> expResult = new ArrayList<>();
        ArrayList<CardAttributes> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetCardsBoundary() {
        System.out.println("getCards");
        CardHand instance = new CardHand();
        ArrayList<CardAttributes> expResult = null;
        ArrayList<CardAttributes> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCards method, of class CardHand.
     */
    @Test
    public void testAddCardsGood() {
        System.out.println("addCards");
        ArrayList<CardAttributes> cards = new ArrayList<>();
        CardHand instance = new CardHand();
        instance.addCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testAddCardsBad() {
        System.out.println("addCards");
        ArrayList<CardAttributes> cards = null;
        CardHand instance = new CardHand();
        instance.addCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testAddCardsBoundary() {
        System.out.println("addCards");
        ArrayList<CardAttributes> cards = null;
        CardHand instance = null;
        instance.addCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class CardHand.
     */
    @Test
    public void testRemoveCardGood() {
        System.out.println("removeCard");
        CardAttributes card = new CardAttributes(CLUBS, TWO);
        CardHand instance = new CardHand();
        CardAttributes expResult = null;
        CardAttributes result = instance.removeCard(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testRemoveCardBad() {
        System.out.println("removeCard");
        CardAttributes card = new CardAttributes(null, null);
        CardHand instance = new CardHand();
        CardAttributes expResult = null;
        CardAttributes result = instance.removeCard(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testRemoveCardBoundary() {
        System.out.println("removeCard");
        CardAttributes card = null;
        CardHand instance = null;
        CardAttributes expResult = null;
        CardAttributes result = instance.removeCard(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class CardHand.
     */
    @Test
    public void testAddCardGood() {
        System.out.println("addCard");
        CardAttributes card = new CardAttributes(CLUBS, TWO);
        CardHand instance = new CardHand();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testAddCardBad() {
        System.out.println("addCard");
        CardAttributes card = new CardAttributes(null, null);
        CardHand instance = new CardHand();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testAddCardBoundary() {
        System.out.println("addCard");
        CardAttributes card = null;
        CardHand instance = new CardHand();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CardHand.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toString");
        CardHand instance = new CardHand();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testToStringBad() {
        System.out.println("toString");
        CardHand instance = new CardHand();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testToStringBoundary() {
        System.out.println("toString");
        CardHand instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
