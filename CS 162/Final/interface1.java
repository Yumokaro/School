//package PFinal;

public interface interface1 {

    String repeat01 = "Error: Cannot save to file!" +
            "implementing default sentence structure.\n";
    String repeat02 = "Error: Cannot read from file!" +
            "implementing default sentence structure.\n";

    static void cantSave () {
        System.out.println(repeat01);
    }
    static void cantRead () {
        System.out.println(repeat02);
    }

}
