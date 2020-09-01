package com.gokhana.java9demo.privateMethodInterface;

public class MagicianImpl implements Magician {

    @Override
    public void raiseWand() {
        System.out.println("Wand raising..");
    }

    @Override
    public void raiseHands() {
        System.out.println("Hands raising..");
    }

    @Override
    public void saySpell(String spell) {
        System.out.println(spell);
    }
}
