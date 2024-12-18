package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
        public static void task1(){
        System.out.println("Задание 1");
        HashMap <Integer, String> phones = new HashMap<>();
        phones.put(6, "металл");
        phones.put(7,"титан");
        phones.put(8, "пластик");
        for (Map.Entry phone: phones.entrySet()){
            System.out.println(phone.getKey() + "   " + phone.getValue());
        }
    }

    public static void task2(){
        System.out.println("Задание 2");
        Map <Integer, String> hours = new HashMap<>();
        hours.put(11, "му");
        hours.put(10, "утро");
        hours.put(14, "день");
        hours.put(18, "вечер");
        // Первый способ решения
        Map<Integer, String> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : hours.entrySet()) {
            if (entry.getValue().length() >= 3) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(map);


        // Второй способ решения
      ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<Integer,String> entry: hours.entrySet()){
            names.add(entry.getValue());
        }
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) ;
            }
        });

        LinkedHashMap <Integer, String> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<Integer, String> entry : hours.entrySet()) {
                if (entry.getValue().length() >= 3) {
                    sortedMap.put(entry.getKey(), entry.getValue());
                }
            }
        System.out.println(sortedMap);

        }
    }
