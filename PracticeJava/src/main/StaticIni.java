package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticIni {

    private static final List<String> CONSTELLATIONS;
    static {
            List<String> constellations = new ArrayList<String>();
            constellations.add("a");
            CONSTELLATIONS = Collections.unmodifiableList(constellations);
    }

    public static void main(String[] args) {
        CONSTELLATIONS.add("");
    }
}
