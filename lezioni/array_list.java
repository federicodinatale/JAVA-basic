package lezioni;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        System.out.println("");

        ArrayList<String> person = new ArrayList<String>();

        person.add("Luca");
        person.add("Mario");

        //stampare a schermo un valore
        System.out.println(person.get(0)); 


        for(int i = 0; i < person.size(); i ++) {
        System.out.println(person.get(i)); 
        }

        //modificare un elemento set()
        person.set(0, "Lucrezia");
        System.out.println(person.get(0)); 

        //rimuovere un elemento remove()
        person.remove(0);

        //rimuovere tutta la arraylist
        person.clear();
        System.out.println(person); 
        



        ArrayList<Integer> voti = new ArrayList<Integer>();

        voti.add(40);
        voti.add(50);


        ArrayList<ArrayList<String>> university = new ArrayList<>();

        ArrayList<String> classe1 = new ArrayList<>();
        classe1.add("Fede");
        classe1.add("Marco");

        ArrayList<String> classe2 = new ArrayList<>();
        classe2.add("Fabrizio");
        classe2.add("Luca");


        university.add(classe1);
        university.add(classe2);

        for(int i = 0; i < university.size(); i ++) {
            System.out.println();
            for( int j = 0; j < university.get(i).size(); j ++) {
                System.out.print(university.get(i).get(j) + " ");
            }
            
        }
     }

}
