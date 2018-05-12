package main;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
public static void main(String[] args) {


    List<String> list = new ArrayList<String>();

    list.add("aaa");
    list.add("bbb");

    for (int i = 0; i < list.size(); i++) {
        System.out.println("value = " + list.get(i));
    }

    for (String value : list) {
        System.out.println("value = " + value);
    }
}
}
