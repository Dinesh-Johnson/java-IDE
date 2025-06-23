package com.xworkz.runner;

import java.io.FileNotFoundException;
import java.io.NotSerializableException;

public class BuiltInExceptionRunner {
    public void methodNull() throws NullPointerException{

        throw new NullPointerException("Null Point Exception");
    }
    public void methodArithMatic() throws ArithmeticException{
        throw new ArithmeticException("Arithmetic Exception");
    }
    public void arrayIndex()throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException("Array INdex Out OF Bounds");
    }
    public void illegalAccess()throws IllegalAccessError{
        throw new IllegalAccessError("IllegalAccessError");
    }
    public void classNotFound ()throws ClassNotFoundException{
        throw new ClassNotFoundException("Class Not Found");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        BuiltInExceptionRunner bm=new BuiltInExceptionRunner();
        bm.methodNull();
        bm.methodArithMatic();
        bm.illegalAccess();
        bm.arrayIndex();
        bm.classNotFound();
    }
}
