package Creational_Design_Pattern.Singleton;

import java.io.*;
class Singleton {
    // static class
    private static Singleton instance;
    private Singleton()
    {
        System.out.println("Singleton is Instantiated.");
    }

    //Lazy Instantiation
    public static Singleton getInstance()
    {
        if (instance == null) {
            synchronized(Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
    public static void doSomething()
    {
        System.out.println(instance.hashCode());
    }
}

class GFG {
    public static void main(String[] args)
    {
        Singleton.getInstance().doSomething();
        System.out.println(Singleton.getInstance().hashCode());
    }
}

