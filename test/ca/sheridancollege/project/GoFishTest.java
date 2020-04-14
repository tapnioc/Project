/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

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
public class GoFishTest {
    
    public GoFishTest() {
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
     * Test of play method, of class GoFish.
     */
    @Test
    public void testPlayGood() {
        System.out.println("play");
        GoFish instance = new GoFish("Go");
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testPlayBad() {
        System.out.println("play");
        GoFish instance = new GoFish("");
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testPlayBoundary() {
        System.out.println("play");
        GoFish instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class GoFish.
     */
    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinner");
        GoFish instance = new GoFish("Go");
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testDeclareWinnerBad() {
        System.out.println("declareWinner");
        GoFish instance = new GoFish("");
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testDeclareWinnerBoundary() {
        System.out.println("declareWinner");
        GoFish instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
