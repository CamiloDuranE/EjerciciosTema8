public class App {
    public static void main(String[] args) throws Exception {    
        Cliente cliente = new Cliente();
        cliente.setEdad(11);
        cliente.setNombre("Pedro");
        cliente.setTelefono("+569 24981209");
        cliente.setCredito(false);

        System.out.println(cliente.getNombre() + " " + "tiene " + cliente.getEdad() + " agnos" + " y su numero de telefono es: " + cliente.getTelefono() + " .Posee linea de credito: " + cliente.isCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Tamara");
        trabajador.setTelefono("+569 43452134");
        trabajador.setSalario(542300);

        System.out.println(trabajador.getNombre() + " " + "tiene " + trabajador.getEdad() + " agnos" + " y su numero de telefono es: " + trabajador.getTelefono() + " .Posee $ " + trabajador.getSalario() + " de salario.");
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public Persona() {
        System.out.println("Estoy en el contructor de Persona.");
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

class Cliente extends Persona{
    private boolean credito;

    public Cliente() {
        System.out.println("Estoy en el contructor de Cliente.");
    }

    public void setCredito(boolean credito){
        this.credito = credito;
    }
    public boolean isCredito(){       
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public Trabajador() {
        System.out.println("Estoy en el contructor de Trabajador.");
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
    }
}
