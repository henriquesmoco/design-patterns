package com.github.henriquesmoco.design_patterns.singleton;

/**
 * Recommended way. It exploits the fact that inner classes are not loaded until
 * they are referenced.
 */
public class SingletonWithInnerClass {
    private SingletonWithInnerClass() {
    }

    public static class SingletonHolder {
        public static SingletonWithInnerClass myInstance = new SingletonWithInnerClass();
    }

    public static SingletonWithInnerClass getInstance() {
        return SingletonHolder.myInstance;
    }

    public void doSomething() {
        System.out.println("done");
    }
}
