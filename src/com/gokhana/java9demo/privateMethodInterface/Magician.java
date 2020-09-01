package com.gokhana.java9demo.privateMethodInterface;

public interface Magician {

    void raiseWand();

    void raiseHands();

    void saySpell(String spell);

    default void throwAbracadabra() {
        prepareForMagic();
        saySpell("Abracadabra!");
    }

    default void throwHocusPocus() {
        prepareForMagic();
        saySpell("Hocus Pocus!");
    }

    private void prepareForMagic() {
        raiseHands();
        raiseWand();
    }
}