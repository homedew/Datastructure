package com.datastructure.dsa;
public class MidSquareHashing {
    private final int SIZE_OF_TABLE = 100;

    public int midSquareHashingFunc(int key) {
        int result =0;
        long keySquare = (long) key * key;

        //convert it to string to know the position
        String keySquareString = String.valueOf(keySquare);

        int lengthOfKeySquare = keySquareString.length();
        int middle = lengthOfKeySquare / 2;
        int numberToExtract =(int)Math.log10(SIZE_OF_TABLE) + 1;

        int start = middle - (numberToExtract / 2); 
        start = start < 0 ? 0 : start;

        int end = start + (numberToExtract);
        end = end > lengthOfKeySquare ? lengthOfKeySquare: end;

        result = Integer.parseInt(keySquareString.substring(start, end));

        return result % SIZE_OF_TABLE;
    }
}


