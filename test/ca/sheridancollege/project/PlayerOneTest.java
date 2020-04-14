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
public class PlayerOneTest {
    
    public PlayerOneTest() {
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
     * Test of addCardsToHand method, of class PlayerOne.
     */
    @Test
    public void testAddCardsToHandGood() {
        System.out.println("addCardsToHand");
        ArrayList<CardAttributes> cards = new ArrayList<>();
        PlayerOne instance = new PlayerOne("Jin");
        instance.addCardsToHand(cards);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testAddCardsToHandBad() {
        System.out.println("addCardsToHand");
        ArrayList<CardAttributes> cards = null;
        PlayerOne instance = new PlayerOne("");
        instance.addCardsToHand(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testAddCardsToHandBoundary() {
        System.out.println("addCardsToHand");
        ArrayList<CardAttributes> cards = null;
        PlayerOne instance = null;
        instance.addCardsToHand(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearHandAndSets method, of class PlayerOne.
     */
    @Test
    public void testClearHandAndSetsGood() {
        System.out.println("clearHandAndSets");
        PlayerOne instance = new PlayerOne("Jin");
        instance.clearHandAndSets();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testClearHandAndSetsBad() {
        System.out.println("clearHandAndSets");
        PlayerOne instance = new PlayerOne("");
        instance.clearHandAndSets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testClearHandAndSetsBoundary() {
        System.out.println("clearHandAndSets");
        PlayerOne instance = null;
        instance.clearHandAndSets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fish method, of class PlayerOne.
     */
    @Test
    public void testFishGood() {
        System.out.println("fish");
        DeckOfCards pool = new DeckOfCards();
        PlayerOne instance = new PlayerOne("Bone");
        CardAttributes expResult =  instance.fish(pool);
        CardAttributes result = instance.fish(pool);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testFishBad() {
        System.out.println("fish");
        DeckOfCards pool = new DeckOfCards();
        PlayerOne instance = new PlayerOne("");
        CardAttributes expResult = instance.fish(pool);
        CardAttributes result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testFishBoundary() {
        System.out.println("fish");
        DeckOfCards pool = null;
        PlayerOne instance = null;
        CardAttributes expResult = null;
        CardAttributes result = instance.fish(pool);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showHand method, of class PlayerOne.
     */
    @Test
    public void testShowHandGood() {
        System.out.println("showHand");
        PlayerOne instance = new PlayerOne("Bean");
        instance.showHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testShowHandBad() {
        System.out.println("showHand");
        PlayerOne instance = new PlayerOne("");
        instance.showHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testShowHandBoundary() {
        System.out.println("showHand");
        PlayerOne instance = null;
        instance.showHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfCardsInHand method, of class PlayerOne.
     */
    @Test
    public void testGetNumberOfCardsInHandGood() {
        System.out.println("getNumberOfCardsInHand");
        PlayerOne instance = new PlayerOne("Jin");
        int expResult = instance.getNumberOfCardsInHand();
        int result = instance.getNumberOfCardsInHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetNumberOfCardsInHandBad() {
        System.out.println("getNumberOfCardsInHand");
        PlayerOne instance = new PlayerOne("");
        int expResult = 0;
        int result = instance.getNumberOfCardsInHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetNumberOfCardsInHandBoundary() {
        System.out.println("getNumberOfCardsInHand");
        PlayerOne instance = null;
        int expResult = 0;
        int result = instance.getNumberOfCardsInHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class PlayerOne.
     */
    @Test
    public void testPlayGood() {
        System.out.println("play");
        PlayerOne instance = new PlayerOne("You");
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testPlayBad() {
        System.out.println("play");
        PlayerOne instance = new PlayerOne("");
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testPlayBoundary() {
        System.out.println("play");
        PlayerOne instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkHand method, of class PlayerOne.
     */
    @Test
    public void testCheckHandGood() {
        System.out.println("checkHand");
        CardAttributes.value v = CardAttributes.value.ACE;
        PlayerOne instance = new PlayerOne("Han");
        boolean expResult = true;
        boolean result = instance.checkHand(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testCheckHandBad() {
        System.out.println("checkHand");
        CardAttributes.value v = CardAttributes.value.ACE;
        PlayerOne instance = null;
        boolean expResult = false;
        boolean result = instance.checkHand(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testCheckHandBoundary() {
        System.out.println("checkHand");
        CardAttributes.value v = null;
        PlayerOne instance = null;
        boolean expResult = false;
        boolean result = instance.checkHand(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countSets method, of class PlayerOne.
     */
    @Test
    public void testCountSetsGood() {
        System.out.println("countSets");
        PlayerOne instance = new PlayerOne("Cris");
        instance.countSets();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testCountSetsBad() {
        System.out.println("countSets");
        PlayerOne instance = new PlayerOne("");
        instance.countSets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testCountSetsBoundary() {
        System.out.println("countSets");
        PlayerOne instance = null;
        instance.countSets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printCompletedSets method, of class PlayerOne.
     */
    @Test
    public void testPrintCompletedSetsGood() {
        System.out.println("printCompletedSets");
        PlayerOne instance = new PlayerOne("Connor");
        instance.printCompletedSets();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testPrintCompletedSetsBad() {
        System.out.println("printCompletedSets");
        PlayerOne instance = new PlayerOne("");
        instance.printCompletedSets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testPrintCompletedSetsBoundary() {
        System.out.println("printCompletedSets");
        PlayerOne instance = null;
        instance.printCompletedSets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSets method, of class PlayerOne.
     */
    @Test
    public void testGetSetsGood() {
        System.out.println("getSets");
        PlayerOne instance = new PlayerOne("Chris");
        int expResult = instance.getSets();
        int result = instance.getSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetSetsBad() {
        System.out.println("getSets");
        PlayerOne instance = new PlayerOne("");
        int expResult = 0;
        int result = instance.getSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGetSetsBoundary() {
        System.out.println("getSets");
        PlayerOne instance = null;
        int expResult = 0;
        int result = instance.getSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveCards method, of class PlayerOne.
     */
    @Test
    public void testGiveCardsGood() {
        System.out.println("giveCards");
        CardAttributes.value value = CardAttributes.value.ACE;
        PlayerOne instance = new PlayerOne("Hun");
        ArrayList<CardAttributes> expResult = instance.giveCards(value);
        ArrayList<CardAttributes> result = instance.giveCards(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGiveCardsBad() {
        System.out.println("giveCards");
        CardAttributes.value value = CardAttributes.value.ACE;
        PlayerOne instance = new PlayerOne("");
        ArrayList<CardAttributes> expResult = null;
        ArrayList<CardAttributes> result = instance.giveCards(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testGiveCardsBoundary() {
        System.out.println("giveCards");
        CardAttributes.value value = null;
        PlayerOne instance = null;
        ArrayList<CardAttributes> expResult = null;
        ArrayList<CardAttributes> result = instance.giveCards(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
