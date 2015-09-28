/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hylje
 */
public class EtusivuRouteTest {
    EtusivuRoute r;
    
    public EtusivuRouteTest() {
    }
    
    @Before
    public void setUp() {
        r = new EtusivuRoute();
    }

    @Test
    public void testReturnsText() throws Exception {
        String ret = (String)r.handle(null, null);
        assertTrue(ret.contains("Viimeisin"));
        assertTrue(ret.contains("Suosituin"));
    }
    
}
