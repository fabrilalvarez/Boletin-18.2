
package boletin.pkg18.pkg2;

public class Boletin182 {

    public static void main(String[] args) {
        // TODO code application logic here
        int [ ] notas = new int [4];
        notas=Metodos.notas(notas);
        String [ ] nombre = {"Fran","Patri","Sergio","David"};
        
        Metodos.verNotas(notas, nombre);
        
        Metodos.notaMedia(notas);
        Metodos.notaAlta(notas);
        Metodos.totalAS(notas);
        Metodos.notasTotales(notas);
        
        
    }
    
}
