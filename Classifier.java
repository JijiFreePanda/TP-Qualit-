package library.service;

public class Classifier{
    private Classifier(){}
    public static String classify(int i) {
            if (i % 2 == 0) {
                return i + " is even";
            } else if (i % 3 == 0) {
                return i + " divisible by 3";
            } else {
                return i + " something else";
            }
    }
    public static void printNumbers(int n){
        for(int i=0;i<n;i++){
            System.out.println(classify(i));
        }
    }
}