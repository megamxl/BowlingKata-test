package at.escapedoom.spring;

public class Frame {

    public int split1;
    public int split2;
    public int split3;

    public Frame() {
        this.split1 = 0;
        this.split2 = 0;
        this.split3 = 0;
    }

    //    public boolean isStrike;
//    public boolean

    public int score() {
        return split1 + split2;
    }

}
