
package com.mycompany.uutislukija;

import com.mycompany.hackernewsuutiset.HackerPaivanUutiset;
import java.util.Map;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args){
        HackerPaivanUutiset hakija = new HackerPaivanUutiset();

	// try to configure a custom port
        Map<String, String> env = System.getenv();
	String portprop = env.get("PORT");
        
        if (portprop != null) {
           try {
                int portnum = Integer.parseInt(portprop);
                port(portnum);
            } catch (NumberFormatException e) {}
        }   
        
        get("/", (req, res) -> "<a href=/viimeisin>Viimeisin</a> <a href=/suosituin>Suosituin</a>");
        get("/viimeisin", (req, res) -> hakija.haeViimeisinUutinen());
        get("/suosituin", (req, res) -> hakija.haeSuosituinUutinen());
    }
}
