/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import spark.Route;
import spark.Spark;

/**
 *
 * @author hylje
 */
public class SparkAdapter {
    public void get(String path, Route route) {
        Spark.get(path, route);
    }
    
    public void port(int portnum) {
        Spark.port(portnum);
    }
}
