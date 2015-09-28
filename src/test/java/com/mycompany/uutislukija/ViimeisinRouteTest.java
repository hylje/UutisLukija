/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import com.mycompany.paivanuutiset.PaivanUutiset;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author hylje
 */
public class ViimeisinRouteTest {
    public PaivanUutiset hakijaMock;
    public ViimeisinRoute r;
    
    public ViimeisinRouteTest() {
    }
    
    @Before
    public void setUp() {
        hakijaMock = mock(PaivanUutiset.class);
        r = new ViimeisinRoute(hakijaMock);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testKutsutaanViimeisinHakua() throws Exception {
        r.handle(null, null);
        
        verify(hakijaMock).haeViimeisinUutinen();
    }   
}
