package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.Random;

public class ExceptionsExample {

    public static void stackOverflowExceptionExample() {
        int a = 3;
        stackOverflowExceptionExample();
    }

    public static void outOfMemmoryExceptionExample() {

        ArrayList<Long> list = new ArrayList();

        Long l = Long.MIN_VALUE;

        while(true) {
            list.add(l++);
        }

    }

    public static void runtimeExceptionExample(int[] array) {
        if(array.length > 4) System.out.println(array[4]);
    }

    public static void handleExceptionExample() {
        try {
            System.out.println("Try start");
            envokeExceptionExample(true);
            envokeUnknownEception(false);
            System.out.println("Try finish");
            return;
        } catch(IOException ex) {
            System.out.println("IOException handler:" + ex.getMessage());
        } catch (Exception e) {
            System.out.println("Exception handler");
        } finally {
            System.out.println("Finally handler");
        }
    }

    public static void throwHigher() throws IOException {
        envokeExceptionExample(true);
    }

    public static void envokeExceptionExample(boolean shouldThrow) throws IOException {
        if(shouldThrow) {
            IOException exeption = new IOException("Could not read file");
            throw exeption;
        }
    }

    public static void envokeUnknownEception(boolean shouldThrow) throws SQLDataException {
        if(shouldThrow) throw new SQLDataException();
    }

    public static void throwsErrors() {
        throw new OutOfMemoryError();
    }

    public static void throwsRuntimeException() {
        throw new NullPointerException();
    }

    public static void throwMyException() throws MyException {
        throw new MyException(System.currentTimeMillis());
    }

}
