package pl.nadoba.oom;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello JVM-Internals!");

        List<int[]> listOfArrays = new LinkedList<int[]>();

        while (true) {
            listOfArrays.add(new int[10000]);
        }
    }
}
