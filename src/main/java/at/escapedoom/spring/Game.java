package at.escapedoom.spring;

import java.util.Arrays;

public class Game {

    Frame[] scores = new Frame[10];
    int curFrame = 0;
    int curFramePart = 0;

    public Game() {
        for (int i = 0; i < scores.length; i++) {
            scores[i] = new Frame();
        }
    }

    void roll(int pins) {
        if (curFramePart == 0){
            scores[curFrame].split1 += pins;
            curFramePart++;
        }
        else if(curFramePart == 1){
            scores[curFrame].split2 += pins;
            if(curFrame < 9) {
                curFramePart = 0;
                curFrame++;
            } else {
                curFramePart++;
            }
        } else {
            scores[curFrame].split3 += pins;
            curFramePart = 0;
        }
    }

    int score() {
        return Arrays.stream(scores).mapToInt(Frame::score).sum();
    }

}
