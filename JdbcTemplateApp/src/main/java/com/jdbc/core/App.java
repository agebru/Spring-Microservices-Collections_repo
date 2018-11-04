package com.jdbc.core;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        CollectionTest test=new CollectionTest(11, new ArrayList<String>(){{

            add("Abebe");
            add("Kebede");
            add("Chane");
            add("Selam");
           // add(234);

        }});

        System.out.println(test);



    }
}
