//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Start-");
        int numberThreads = 10;
        int repetitions = 5;
        Thread[] threads = new Thread[numberThreads];
        for (int i = 0; i < numberThreads; i++) {
            char CharacterToAdd = (char) ('A' + i);
            threads[i] = new Thread(new StringModifier(buffer, CharacterToAdd, repetitions));
            threads[i].start();
            System.out.println(Thread.currentThread().getName()+ " write: " +buffer.toString());
        }
        for (int i = 0; i < numberThreads; i++) {
            try{
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("String Modified: " +buffer.toString());
    }
}