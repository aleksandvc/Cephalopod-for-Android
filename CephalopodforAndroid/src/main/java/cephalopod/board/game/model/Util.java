package cephalopod.board.game.model;

import java.io.Serializable;
import java.util.Random;

/**
 * Utilities class.
 */
public final class Util implements Serializable {
    /**
     * Pseudo-random number generator. Only single instance is used in the project.
     */
    public static final Random PRNG = new Random();

    /*
    *Default Constructor of the Utilities class
     */
    private Util() {
        /*
         * Class usage only.
         */
    }
}
