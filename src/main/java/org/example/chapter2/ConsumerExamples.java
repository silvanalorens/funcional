package org.example.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class ConsumerExamples {
    static List<Object> lst = new ArrayList<>();
    public static void main(String[] args)
    {
        lst.add("Hello bros");
        lst.add(2020);
        lst.add(true);
        lst.add(48.88f);
        usingConsumer("Hola soy un valor de tipo 1", System.out::println, lst::add, ConsumerExamples::printLst);
    }

    private static <T> void printLst(T value){
         System.out.println("Se añadio a la lista el valor:" + value + "total valores");
         lst.forEach(System.out::println);
    }

    private static <T> void usingConsumer(T value, Consumer<T> consume, Consumer<T> consumer2,Consumer<T> consumer3)
    {
        consume.accept(value);
        consumer2.accept(value);
        consumer3.accept(value);
        consume.andThen(consumer2)
                        .andThen(consumer3);
        consume.accept(value);
    }
}
