import java.io.*;
import java.util.*;
import java.util.Arrays;

class GenericStack<E> {
    //private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    private E[] array;
    private final int DEFAULT_LENGTH = 4;
    private int stackSize; //occupied slots in array
    private final E emptyValue = null;

    public GenericStack(){
        array = (E[]) new Object[DEFAULT_LENGTH];
    }

    public GenericStack(int inputLength){
        array = (E[]) new Object [inputLength];
    }
    
    public E peek() {
        if(isEmpty())
            return null;
        return (E) array[getStackSize() - 1];
    }

    public int getStackSize() {
        int nullCount = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]==emptyValue){
                nullCount++;
            }
        }
        return array.length - nullCount;
    }

    public void push(E o) {
        if(getStackSize()==array.length)
            array = doubleLength();
        array[getStackSize()] = o;
    }

    public E pop() {
        E o = array[getStackSize() - 1];
        array[getStackSize() - 1] = emptyValue;
        return o;
    }

    public boolean isEmpty() {
        if(getStackSize()==0)
            return true;
        return false;
    }

    public E[] doubleLength(){
        int oldLength = array.length;
        int newLength = array.length * 2;
        E[] newArray = (E[]) new Object[newLength];
        for(int i=0; i<oldLength; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    //@Override
    public String toString() {
        String outputString = "";
        for(int i = 0; i<getStackSize(); i++){
            outputString += " ";
            outputString += array[i];
        }
        return "stack: "+array.length+" "+outputString;
    }
}