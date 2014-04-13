package io.github.kongeor.playground.generics.common;


import java.util.Collection;

public class CreatureUtils {

    public static <T extends Comparable<? super T>> T max(Collection<? extends T> creatures) {
        T strongest = creatures.iterator().next();
        for (T creature : creatures) {
            if (strongest.compareTo(creature) < 0) {
                strongest = creature;
            }
        }
        return strongest;
    }
}
