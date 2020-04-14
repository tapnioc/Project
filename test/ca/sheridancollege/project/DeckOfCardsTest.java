/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

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
public class DeckOfCardsTest {
    
    public DeckOfCardsTest() {
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
     * Test of generateDeck method, of class DeckOfCards.
     */
    @Test
    public void testGenerateDeckGood() {
        System.out.println("generateDeck");
        DeckOfCards instance = new DeckOfCards();
        instance.generateDeck();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGenerateDeckBad() {
        System.out.println("generateDeck");
        DeckOfCards instance = null;
        instance.generateDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGenerateDeckBoundary() {
        System.out.println("generateDeck");
        DeckOfCards instance = null;
        instance.generateDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class DeckOfCards.
     */
    @Test
    public void testGetCardsGood() {
        System.out.println("getCards");
        int numberOfCards = 52;
        DeckOfCards instance = new DeckOfCards();
        ArrayList<CardAttributes> expResult = instance.getCards(numberOfCards);
        ArrayList<CardAttributes> result = instance.getCards(numberOfCards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetCardsBad() {
        System.out.println("getCards");
        int numberOfCards = 0;
        DeckOfCards instance = new DeckOfCards();
        ArrayList<CardAttributes> expResult = null;
        ArrayList<CardAttributes> result = instance.getCards(numberOfCards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetCardsBoundary() {
        System.out.println("getCards");
        int numberOfCards = 0;
        DeckOfCards instance = null;
        ArrayList<CardAttributes> expResult = null;
        ArrayList<CardAttributes> result = instance.getCards(numberOfCards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardOnTop method, of class DeckOfCards.
     */
    @Test
    public void testGetCardOnTopGood() {
        System.out.println("getCardOnTop");
        DeckOfCards instance = new DeckOfCards();
        CardAttributes expResult = instance.getCardOnTop();
        CardAttributes result = instance.getCardOnTop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetCardOnTopBad() {
        System.out.println("getCardOnTop");
        DeckOfCards instance = null;
        CardAttributes expResult = null;
        CardAttributes result = instance.getCardOnTop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetCardOnTopBoundary() {
        System.out.println("getCardOnTop");
        DeckOfCards instance = null;
        CardAttributes expResult = null;
        CardAttributes result = instance.getCardOnTop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeckSize method, of class DeckOfCards.
     */
    @Test
    public void testGetDeckSizeGood() {
        System.out.println("getDeckSize");
        DeckOfCards instance = new DeckOfCards();
        int expResult = instance.getDeckSize();
        int result = instance.getDeckSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetDeckSizeBad() {
        System.out.println("getDeckSize");
        DeckOfCards instance = new DeckOfCards();
        int expResult = 0;
        int result = instance.getDeckSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetDeckSizeBoundary() {
        System.out.println("getDeckSize");
        DeckOfCards instance = null;
        int expResult = 0;
        int result = instance.getDeckSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class DeckOfCards.
     */
    @Test
    public void testShuffleGood() {
        System.out.println("shuffle");
        DeckOfCards instance = new DeckOfCards();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testShuffleBad() {
        System.out.println("shuffle");
        DeckOfCards instance = null;
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testShuffleBoundary() {
        System.out.println("shuffle");
        DeckOfCards instance = null;
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCards method, of class DeckOfCards.
     */
    @Test
    public void testSetCardsGood() {
        System.out.println("setCards");
        ArrayList<CardAttributes> cards = new ArrayList<>();
        DeckOfCards instance = new DeckOfCards();
        instance.setCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testSetCardsBad() {
        System.out.println("setCards");
        ArrayList<CardAttributes> cards = null;
        DeckOfCards instance = new DeckOfCards();
        instance.setCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testSetCardsBoundary() {
        System.out.println("setCards");
        ArrayList<CardAttributes> cards = null;
        DeckOfCards instance = new DeckOfCards();
        instance.setCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DeckOfCards.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DeckOfCards instance = new DeckOfCards();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
