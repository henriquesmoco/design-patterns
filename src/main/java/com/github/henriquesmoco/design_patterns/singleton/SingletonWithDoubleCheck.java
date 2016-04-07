package com.github.henriquesmoco.design_patterns.singleton;

/**
 * There is a memory model problem with this, fixed in Java 5.
 */
public class SingletonWithDoubleCheck {

    private static SingletonWithDoubleCheck myInstance;

    private SingletonWithDoubleCheck() {
    }

    public static SingletonWithDoubleCheck getInstance() {
        if (myInstance == null) {
            synchronized (SingletonWithDoubleCheck.class) {
                if (myInstance == null) {
                    myInstance = new SingletonWithDoubleCheck();
                }
            }
        }
        return myInstance;
    }

    public void doSomething() {
        System.out.println("done");
    }
}
