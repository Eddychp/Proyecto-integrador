package pe.edu.upeu.app;

import pe.edu.upeu.app.utils.leerteclado;
import pe.edu.upeu.app.utils.Menu;

public class App {

 public static void main(String[] args) {
        leerteclado teclado = new leerteclado();
        Menu menu = new Menu();

        menu.MenuOpt(teclado);


    }
  
}