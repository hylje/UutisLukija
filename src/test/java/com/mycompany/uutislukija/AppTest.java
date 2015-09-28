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
    public App a;
    
    public AppTest() {
    }
    
    @Before
    public void setUp() {
        hakijaMock = mock(PaivanUutiset.class);
    }

    @Test
    public void testSetUpConfiguresPort() {
        a = new App(hakijaMock, "5555");
        
        a.setUp();
        
        assertEquals(a.getPortnum(), 5555);
    }
    
    @Test
    public void testSetUpLeavesPortAlone() {
        a = new App(hakijaMock, null);
        
        a.setUp();
        
        assertEquals(a.getPortnum(), 0);
    }
    
}
