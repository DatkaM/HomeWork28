package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    /**
     *Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
     */
    public static void main(String[] args) {

        Integer[] array = {3,7,8,6,12,8,1,4,11,4};
        Integer massiv = Arrays.stream(array).filter(x->x%2==0).map(x-> (x*x)).max(Integer::compareTo).get();

        System.out.println(massiv);

    }
}
