package edu.uoc.ds.adt;

public class PR0Array {

    public final int CAPACITY = 50;

    private int[] array;

    public PR0Array() {
        newArray();
    }
    private void newArray() {
        array = new int[CAPACITY];
        fillArray();
    }

    private void fillArray() {
        int i = 0;
        for (int par = 0; i < CAPACITY; par+=2) {
            array[i] = par;
            i++;
        }
    }

    public int getIndexOf(int num){
        int index = -1, i = 0;
        boolean find = false;
        while(!find && i < CAPACITY){
            if(array[i] == num){
                find = true;
                index = i;
            }
            i++;
        }
        return index;
    }

    public int binarySearch(int num){
        int index = -1, first = 0, last = CAPACITY;
        boolean find = false;
        int mid = (first + last)/2;
        while( first <= last  && !find){
            if ( array[mid] < num ){
                first = mid + 1;
            }else if ( array[mid] == num ){
                index = mid;
                find = true;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return index;
    }

    public int[] getArray() {
        return array;
    }
}
