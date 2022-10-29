public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNombre("Camilo");
        persona.setTelefono("+569 24981209");

        System.out.println(persona.getNombre() + " " + "tiene " + persona.getEdad() + " agnos" + " y su numero de telefono es: " + persona.getTelefono());       
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public Persona() {
        //Constructor sin parametros
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
