package com.eldenhackers.utilities;

import java.util.Random;

public class CustomRandomGenerator {

    public static Integer getRangedInt(int low, int high){
        Random r = new Random();
        return r.nextInt(high - low ) +low;
    }
}
