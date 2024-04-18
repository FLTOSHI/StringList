package edu.fltoshi.stringlist;

public class Main {
    public static void main(String[] args) {

        StringListC stringA = new StringListC();

        stringA.add(0, "1");
        System.out.println(stringA.contains("1"));
    }
}