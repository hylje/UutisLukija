/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author hylje
 */
public class EtusivuRoute implements Route {
    @Override
    public Object handle(Request req, Response res) throws Exception {
        return "<a href=/viimeisin>Viimeisin</a> <a href=/suosituin>Suosituin</a>";
    }
}
