package P7InheritanceExceptions;

public class monkeyWrenchException extends Exception {

    public monkeyWrenchException () {

        System.out.println("A ship's engine blew up, resulting in destruction of the entire fleet");
        System.out.println("Dispatch a new fleet and be sure to reduce the thrust!");

    }

}
