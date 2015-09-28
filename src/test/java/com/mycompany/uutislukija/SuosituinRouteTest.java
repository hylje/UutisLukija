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
public class SuosituinRouteTest {
    public PaivanUutiset hakijaMock;
    public SuosituinRoute r;
    
    @Before
    public void setUp() {
        hakijaMock = mock(PaivanUutiset.class);
        r = new SuosituinRoute(hakijaMock);
    }
    
    public SuosituinRouteTest() {
    }

    @Test
    public void testKutsutaanSuosituinHakua() throws Exception {
        r.handle(null, null);
        
        verify(hakijaMock).haeSuosituinUutinen();
    }
    
}
