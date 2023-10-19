
import com.mycompany.ejercicio3.MyList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bosque
 */
public class Prueba {
    public static void main(String[] args) {
        
        MyList<String> l;
        l = new MyList();
        l.add("Hola");
        l.add("que tal");
        l.add("adios");
        l.showMyList();
    }
    
}
