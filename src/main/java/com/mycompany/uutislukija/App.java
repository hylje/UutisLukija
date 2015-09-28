/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import com.mycompany.paivanuutiset.PaivanUutiset;
import java.util.Map;
import static spark.Spark.get;
import static spark.Spark.port;

/**
 *
 * @author hylje
 */
public class App {
    private final PaivanUutiset hakija;
    private int portnum;
    private String portprop;
    
    App(PaivanUutiset hakija, String portprop) {
        this.hakija = hakija;
        this.portprop = portprop;
        this.portnum = 0;
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
            port(portnum);
        }
        get("/", (req, res) -> "<a href=/viimeisin>Viimeisin</a> <a href=/suosituin>Suosituin</a>");
        get("/viimeisin", new ViimeisinRoute(hakija));
        get("/suosituin", new SuosituinRoute(hakija));
    }
}
