package io.github.kongeor.playground.generics.common;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CreatureUtilsTest {

    List<BaseCreature> creatures;
    List<Worm> worms;
    Worm w1, w2;
    Giant g1, g2;

    @Before
    public void setUp() throws Exception {
        creatures = new ArrayList<>();
        w1 = new Worm("Chuck", 15);
        w2 = new Worm("Takis", 20);
        g1 = new Giant("Rambo", 50);
        g2 = new Giant("Hulk", 1000);
        creatures = Arrays.asList(w1, w2, g1, g2);
        worms = Arrays.asList(w1, w2);
    }

    @Test
    public void testMax() {
        BaseCreature strongest = CreatureUtils.max(creatures);
        assertEquals(strongest, g2);
    }
    
    @Test
    public void testMaxWorm() {
        Worm strongest = CreatureUtils.max(worms);
        assertEquals(strongest, w2);
    }

}
