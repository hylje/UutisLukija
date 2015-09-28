/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import com.mycompany.paivanuutiset.PaivanUutiset;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author hylje
 */
public class SuosituinRoute implements Route {
    private final PaivanUutiset hakija;
    
    SuosituinRoute(PaivanUutiset hakija) {
        this.hakija = hakija;
    }
    
    @Override
    public Object handle(Request rqst, Response rspns) throws Exception {
        return hakija.haeSuosituinUutinen();
    };
    
}
