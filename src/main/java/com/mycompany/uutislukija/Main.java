
package com.mycompany.uutislukija;

import com.mycompany.hackernewsuutiset.HackerPaivanUutiset;
import com.mycompany.paivanuutiset.PaivanUutiset;
import java.util.Map;

public class Main {
    
    public static void main(String[] args){
	// try to configure a custom port
        PaivanUutiset hakija = new HackerPaivanUutiset();
        App app = new App(new SparkAdapter(), hakija);
        app.setPortprop(System.getenv().get("PORT"));
        app.setUpAndRun();
    }
}
