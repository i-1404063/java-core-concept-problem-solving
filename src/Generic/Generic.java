package Generic;

import java.util.*;
import java.io.*;

public class Generic {

    public static void main(String... args) {

        ArrayList<String> stList = new ArrayList<>();
        stList.add("null");
        print(stList);
    }

    public static void print(List<? extends String> list) {
        for (String st : list) {
            System.out.println(st);
        }
    }
}
