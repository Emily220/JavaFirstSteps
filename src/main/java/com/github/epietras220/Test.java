package com.github.epietras220;

import com.github.epietras220.list.array.MyArrayList;
import com.github.epietras220.list.linked.MySingleLinkedList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        MySingleLinkedList<String> list = new MySingleLinkedList<>();
        List<String> lista = new ArrayList<>();

        lista.add("emilka");
        lista.add("jacek");
        //lista.add("lukasz");
       // lista.add("piotrek");
        lista.add("emilka");
       //lista.add("pro");

        list.add("emilka");
        list.add("jacek");
        list.add("lukasz");
        list.add("piotrek");
        list.add("emilka");
        list.add("kinga");

        //list.subList(2,4);
        //System.out.println(list.get(1));

        //System.out.println(list.size());
        //System.out.println(list.isEmpty());
        //System.out.println(list.contains("emilka"));
        // list.toArray();   - POPRAW!!
        //System.out.println(list.add("natalka"));

//        list.remove("piotrek");
//        System.out.println(list.get(3));

        //System.out.println(list.containsAll(lista));

        //list.addAll(lista);
        //System.out.println(list.get(10));

        //list.addAll(2, lista);
        //System.out.println(list.get(11));

//        lista.removeAll(list);
//        for (String a : lista) {
//            System.out.println(a);
//        }

//        lista.retainAll(list);
//        System.out.println(lista.get(1));

        //list.clear();
        //System.out.println(list.size());

        //list.set(2,"justyna");
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.print(list.get(2));

//        list.add(2, "maja");
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.print(list.get(2));

        //list.remove(2);
        //System.out.println(list.get(2));

        // System.out.print(list.indexOf("jacek"));

        //System.out.println(list.lastIndexOf("emilka"));


        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("emilka");
        myArrayList.add("ola");

        System.out.println(myArrayList.set(-4, "lala"));
//        myArrayList.add("jas");
//        myArrayList.add("malgosia");
//        myArrayList.add("jacek");
//        myArrayList.add(1, "dawid");


//
//        myArrayList.addAll(2,lista);
        //System.out.println(myArrayList.subList(2,4));

        //System.out.println(myArrayList.get(0));



//        System.out.println(myArrayList.get(0));
//        System.out.println(myArrayList.get(1));
//        System.out.println(myArrayList.get(2));
//        System.out.println(myArrayList.get(3));
      //  System.out.println(myArrayList.get(6));

        //System.out.println(myArrayList.size());
       // myArrayList.removeAll(lista);


        //System.out.println(myArrayList.isEmpty());
        //System.out.println(Arrays.toString(myArrayList.toArray()));

        //myArrayList.set(1, "tomek");
        //System.out.println(myArrayList.get(1));

        //myArrayList.remove("ola");

        //myArrayList.clear();
        //System.out.println(myArrayList.get(1));

        //System.out.println(myArrayList.lastIndexOf("emilka"));

        //System.out.println(list.containsAll(lista));





        //Prime prime = new Prime(0);
        //SieveOfEratosthenes sieve = new SieveOfEratosthenes(100);
        //sieve.sieve();

    }
}



