/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author jose
 */
public class Main {
        public String Mensaje(String frase)  {
            return frase;
        }
        
        public static void main(String[] args) {
            //Mensaje mensa=new Mensaje("Hola");
            System.out.println("principal.Main.main()");
            Main main=new Main();
            String bienvenida="Bienvenido a este nuevo mundo";
            System.out.println(main.Mensaje(bienvenida));
            Metodos metodos=new Metodos();
            metodos.datos(bienvenida);
            
            //Prueba para ver si cuando arranco el proyecto automáticamente
            //coge la última versión. Ahora voy a subir este texto
       
    }


    }
