package com.gokhana.java9demo;

import com.gokhana.java9demo.immutableCollections.Spectators;
import com.gokhana.java9demo.privateMethodInterface.Magician;
import com.gokhana.java9demo.privateMethodInterface.MagicianImpl;

public class Main {

    public static void main(String[] args) {
        Spectators spectators = new Spectators();
        spectators.getSpectators();
        Magician magician = new MagicianImpl();
        magician.throwAbracadabra();
    }
}
