package at.escapedoom.spring;

public class Frame {

    public int split1 = 0;
    public int split2 = 0;

    public Frame() {
        this.split1 = 0;
        this.split2 = 0;
    }

    //    public boolean isStrike;
//    public boolean

    public int score() {
        return split1 + split2;
    }

}
