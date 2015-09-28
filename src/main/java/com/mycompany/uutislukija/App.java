/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import com.mycompany.paivanuutiset.PaivanUutiset;
import java.util.Map;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 *
 * @author hylje
 */
public class App {
    private final PaivanUutiset hakija;
    private int portnum;
    private String portprop;
    private final SparkAdapter spark;
    
    App(SparkAdapter spark, PaivanUutiset hakija) {
        this.spark = spark;
        this.hakija = hakija;
        this.portnum = 0;
    }
    
    public void setPortprop(String portprop) {
        this.portprop = portprop;
    }
    
    public int getPortnum() {
        return portnum;
    }
    
    public void setUpAndRun() {
        setUp();
        run();
    }
        
    public void setUp() {
        if (portprop != null) {
           try {
                portnum = Integer.parseInt(portprop);
            } catch (NumberFormatException e) {}
        }
    }
       
    public void run() {
        if (portnum > 0) {
            spark.port(portnum);
        }
        spark.get("/", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                return "<a href=/viimeisin>Viimeisin</a> <a href=/suosituin>Suosituin</a>";
            }
        });
        spark.get("/viimeisin", new ViimeisinRoute(hakija));
        spark.get("/suosituin", new SuosituinRoute(hakija));
    }
}
