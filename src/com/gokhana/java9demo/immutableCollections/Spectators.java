package com.gokhana.java9demo.immutableCollections;

import java.util.List;
import java.util.Optional;

public class Spectators {

    public List<String> getSpectators() {
        List<String> names = List.of("Gokhan", "Ahmet", "Ayse", ""); //Immutable Collection Factory

        //List<String> names = List.of("Gokhan", "Ahmet", "Ayse", "Fatma");

        System.out.println("Spectator Names: " + names);

        Optional<String> spectorName;
        if (names.get(names.size() - 1).isEmpty()) {
            spectorName = Optional.empty();
        } else {
            spectorName = Optional.of(names.get(names.size() - 1));
        }
        Optional<String> defaultSpector = Optional.of("Default");

        chosenAssistantSpector(spectorName);

        //if there is no spectator assistant set default one
        chosenAssistantSpector(spectorName.or(() -> defaultSpector));

        return names;
    }

    private void chosenAssistantSpector(Optional<String> spectorName) {
        spectorName.ifPresentOrElse(x -> System.out.println("Assistant Spectator is : " + x), () ->
                System.out.println("There is not Assistant Spectator"));
    }


    //NullPointerException
    //List<String> names2 = List.of("Gokhan", "Ahmet", "Ayse", null);
    //UnsupportedOperationException
    //names.add("Fatma");
}
