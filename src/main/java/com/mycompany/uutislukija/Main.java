
package com.mycompany.uutislukija;

import com.mycompany.hackernewsuutiset.HackerPaivanUutiset;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args){
        HackerPaivanUutiset hakija = new HackerPaivanUutiset();
        get("/", (req, res) -> "<a href=/viimeisin>Viimeisin</a> <a href=/suosituin>Suosituin</a>");
        get("/viimeisin", (req, res) -> hakija.haeViimeisinUutinen());
        get("/suosituin", (req, res) -> hakija.haeSuosituinUutinen());
    }
}
