
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a JEOSCREEN");
        System.out.println("Pelicula: Armagedon");
        int fechaLanzamiento= 1999;
        boolean disponible=true;
        double calificacion= 7.1;
        double media= (8.1+6.0+2)/3;
        System.out.println(media);
        String informacion = "Pelicula lanzada en: \n" + fechaLanzamiento + "\n disponible: si\n" +  "Calificacion: "+ calificacion;

        System.out.println(informacion);
    }
}