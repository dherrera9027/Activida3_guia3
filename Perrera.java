import java.util.ArrayList;
import java.util.Scanner;
public class Perrera
{
   private String nombre;
   private String localidad;
   private String raza;
   private int cedula;
   private String nombreDueño;
   private String dia;
   private String telefono;
   
   public Perrera(String nombre, String localidad, String raza, int cedula, String nombreDueño, String dia, String telefono)
   {
       this.nombre = nombre;
       this.localidad = localidad;
       this.raza = raza;
       this.cedula = cedula;
       this.nombreDueño = nombreDueño;
       this.dia = dia;
       this.telefono = telefono;
   }
  
   public String obtenerNombre()
   {
       return this.nombre;
   }
   
   public String obtenerLocalidad()
   {
       return this.localidad;
   }
   
   public String obtenerRaza()
   {
       return this.raza;
   }
   
   public int obtenerCedula()
   {
       return this.cedula;
   }
   
   public String obtenerNombreDueño()
   {
       return this.nombreDueño;
   }
   
   public String obtenerDia()
   {
       return this.dia;
   }
   
   public String obtenerTelefono()
   {
       return this.telefono;
   }
   
   public void verLocalidad()
   {
       System.out.println("-Nombre: " +nombre);
       System.out.println("-Raza: " +raza);
       System.out.println("-Día en que asiste: " +dia);
       System.out.println("-Cedulad del dueño: "+cedula);
       System.out.println("-Nombre del dueño: "+nombreDueño);
       System.out.println("-Telefono de contacto del dueño: "+telefono);
       System.out.println("------------------------------------------");
   }
   
   public static void mostrarPerrosLocalidad (ArrayList<Perrera> bd){
       String localidad;
       Perrera perrera;
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Seleccione la localidad del que quiere ver la candidad de perros.");
       localidad = entrada.nextLine();
       for(Perrera nuevoPerro : bd)
       {
           if (nuevoPerro.obtenerLocalidad().equals(localidad))
           {
               nuevoPerro.verLocalidad();
            }
       }
   }
   
   public static void main (String[] args)
   {
       ArrayList<Perrera> nuevoPerroPerrera = new ArrayList<>();
       Scanner entrada = new Scanner(System.in);
       int opcion;
       String nombre;
       String localidad;
       String raza;
       int cedula;
       String nombreDueño;
       String dia;
       String telefono;
       Perrera perrera;
       int cantidadPerros;
       
        do{
           System.out.println("Menu de opciones");
           System.out.println("1. Agregue un nuevo perro a la base de datos del colegio.");
           System.out.println("2. Ver información de perros por localidad.");
           System.out.println("3. Cantidad de perros del colegio");
           System.out.println("0. Salir.");
           opcion = entrada.nextInt(); 
           
           switch (opcion){
               case 1:
               entrada.nextLine();
               System.out.println("Ingrese el nombre perro.");
               nombre = entrada.nextLine();
               System.out.println("Ingrese la localidad: Teusaquillo, Suba, Usaquén y Chapinero.");
               localidad = entrada.nextLine();
               System.out.println("Ingrese la raza.");
               raza = entrada.nextLine();
               System.out.println("Ingrese el día en que asiste el perro al colegio.");
               dia = entrada.nextLine();
               System.out.println("Ingrese el nombre del dueño.");
               nombreDueño = entrada.nextLine();
               System.out.println("Ingrese el telefono de contacto del dueño.");
               telefono = entrada.nextLine();
               System.out.println("Ingrese la cedula del dueño.");
               cedula = entrada.nextInt();
               
               perrera = new Perrera(nombre, localidad, raza, cedula, nombreDueño, dia, telefono);
               nuevoPerroPerrera.add(perrera);
               
               break;
               
               case 2:
               mostrarPerrosLocalidad(nuevoPerroPerrera);
               break;
          
               case 3:
               cantidadPerros = nuevoPerroPerrera.size();
               System.out.println("El numero de perros de la empresa es: "+cantidadPerros+ " perros");
           }
        }while (opcion != 0);
   }
}
