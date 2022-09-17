package lezioni.arrayObject;

public class Persona {
    String name;
    int age;
    String favColor;


    Persona(String name, int age, String favColor) {

        this.name = name;
        this.age = age;
        this.favColor = favColor;
    }

    public String toString() {
        String stringa =  this.name + " "+ this.age + " "+ this.favColor;
        return stringa;
    }


    void saluta(Persona personaDaSalutare) {
        System.out.println("Ciao " + personaDaSalutare.name + " io sono " + this.name);
    }
}


