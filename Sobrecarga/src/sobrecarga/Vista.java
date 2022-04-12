package sobrecarga;

import Modelo.Sobre;
import javax.swing.JOptionPane;

public class Vista {

    public static void main(String[] args) {
        Sobre  ob1=null, ob2=null, ob3=null ;
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("menu Principal\n 1. carga\n 2. imprimir\n 3. salir"));
            switch(op){
                case 1:
                    do{
                        op = Integer.parseInt(JOptionPane.showInputDialog("menu Cargar\n 1. aleatorio\n 2. teclado\n 3.multiplicaar\n 4.volver"));
                        switch(op){
                            case 1:
                                ob1 = new Sobre();
                                break;
                            case 2:
                                ob2 = new Sobre(1);
                                break;
                            case 3:
                                ob3 = new Sobre(ob1,ob2);
                                break;
                            
                        }
                
                
                    }while (op != 4);
                    break;
                case 2: 
                    do{
                        op = Integer.parseInt(JOptionPane.showInputDialog("menu Imprimir\n 1. ob1\n 2. ob2\n 3. ob3 \n 4. volver"));
                        switch(op){
                            case 1:
                                ob1.imprimir();
                                break;
                            case 2:
                                ob2.imprimir();
                                break;
                            case 3:
                                ob3.imprimir();
                                break;
                                
                        }
                
                
                    }while (op != 4);
                    break;
                   
            }
        } while (op != 3);

    }

}