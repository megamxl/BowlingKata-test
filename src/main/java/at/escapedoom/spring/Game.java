package at.escapedoom.spring;

import java.util.Arrays;

public class Game {



    int[] scores = new int[10];


    public Game() {
    }

    void roll(int pins){

    }

    int score(){
        return Arrays.stream(scores).sum();
    }

}
