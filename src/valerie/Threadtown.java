package valerie;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Threadtown {
    public static void main(String[] args) {

        Scanner s = null;
        try {
            s = new Scanner(new File("cards.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.nextLine());
        }
        s.close();


            System.out.println(list);


        System.out.println("This is the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==The Devil==");
        anotherThread.start();


        new Thread() {
            public void run() {
                System.out.println("This is the anon class in main thread");

            }
        }.start();
        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
             public void run(){
                System.out.println("This is from another class, runnable");
            }
        });
        myRunnableThread.start();

        System.out.println("This is another one from main thread");


    }

}