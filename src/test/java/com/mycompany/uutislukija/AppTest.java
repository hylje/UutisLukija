/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import com.mycompany.paivanuutiset.PaivanUutiset;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author hylje
 */
public class AppTest {
    public PaivanUutiset hakijaMock;
    public SparkAdapter sparkMock;
    public App a;
    
    public AppTest() {
    }
    
    @Before
    public void setUp() {
        hakijaMock = mock(PaivanUutiset.class);
        sparkMock = mock(SparkAdapter.class);
        a = new App(sparkMock, hakijaMock);
    }

    @Test
    public void testSetUpConfiguresPort() {
        a.setPortprop("5555");
        a.setUp();
        
        assertEquals(a.getPortnum(), 5555);
        
        a.run();
        
        verify(sparkMock, times(1)).port(5555);
    }
    
    @Test
    public void testSetUpLeavesPortAlone() {
        a.setUp();
        
        assertEquals(a.getPortnum(), 0);
    }
    
    @Test
    public void testRoutesAreSetUp() {
        a.setUpAndRun();
        verify(sparkMock, times(3)).get(anyString(), anyObject());
    }
}
