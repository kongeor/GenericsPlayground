package io.github.kongeor.playground.generics.common;


public class BaseCreature implements Comparable<BaseCreature> {

    private final String name;
    private final int strength;

    public BaseCreature(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
    
    public int getStrength() {
        return strength;
    }
    
    @Override
    public int compareTo(BaseCreature worm) {
        return getStrength() < worm.getStrength() ? -1 :
            getStrength() > worm.getStrength() ? 1 : 0;
    }
    
    @Override
    public String toString() {
        return name + " (" + strength + ")";
    }
}
