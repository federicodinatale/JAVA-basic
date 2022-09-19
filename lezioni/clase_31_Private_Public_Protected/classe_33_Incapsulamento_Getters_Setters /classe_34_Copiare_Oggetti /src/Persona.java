public class Persona {
    private String name;
    private String surname;

    Persona(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    Persona(Persona persona) {
        persona.copy(persona);
    }
    public String toString() {
        return this.name + " " + this.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
         this.name = name;
    }

    public void setSurname(String surname) {
         this.surname = surname;
    }

    public void copy(Persona persona) {
        this.setName(persona.getName());
        this.setSurname(persona.getSurname());
    }
}
