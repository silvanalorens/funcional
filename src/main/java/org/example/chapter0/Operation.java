package org.example.chapter0;

@FunctionalInterface
public interface Operation {
    float operation();

    private void interfacePrivateMethod(){
        System.out.println("Llamando al método privado de una interfaz");
        interfaceStaticMethod();

    }

    static void interfaceStaticMethod(){
        System.out.println("Llamando al metodo estatico de la interface");
    }

    default void interfaceDefaultMethod(){
        interfacePrivateMethod();
        interfaceStaticMethod();
        System.out.println("llamando al método default de una interfaz");

    }
}
