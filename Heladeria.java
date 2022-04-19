/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heladeria;
import java.util.*;
/**
 *
 * @author Raul
 */
public class Heladeria {
    private double precio;
    private String sabor,sabor1,sabor2,sabor3,sabor4,recipiente;

    public Heladeria(){
        
    }

    public void setRecipiente(String recipiente) {
        this.recipiente = recipiente;
    }

    public void setPrecio(double precio) {
        if(recipiente.equalsIgnoreCase("cono")){
            this.precio+=1;
        }else{
            this.precio+=0.50;
        } 
    }
    public double getPrecio() {
        return precio;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void setSabor1(String sabor1) {
        this.sabor1 = sabor1;
    }
    public void setSabor2(String sabor2) {
        this.sabor2 = sabor2;
    }
    public void setSabor3(String sabor3) {
        this.sabor3 = sabor3;
    }
    public void setSabor4(String sabor4) {
        this.sabor4 = sabor4;
    }

    public String toString() {
        if(sabor1==null&&sabor4==null){
            precio+=1;
            return "Aqui tiene su helado con sabor "+sabor+" en su "+recipiente+" son "+precio;
            
        }else{
            if(sabor2==null&&sabor3==null){
                precio+=1.50;
                return "Aqui tiene su helado con sabores "+sabor+" "+sabor1+" en su "+recipiente+" son "+precio;
            }else{
                return "Aqui tiene su helado con sabores "+sabor+" "+sabor1+" "+sabor2+" "+sabor3+" "+sabor4+ " en su "+recipiente+" son "+precio;
            }
        }
        
    }
    public static void main(String[] args) {
        Heladeria a=new Heladeria();
        String n="si";
        while(n.equalsIgnoreCase("si")){
            System.out.println("Introduzca una opcion: ");
            System.out.println("-----------------------------------------------");
            System.out.println("1. ¿Donde quiere su helado?");
            System.out.println("2. ¿De que sabor quiere su helado?");
            System.out.println("3. ¿Quiere comprar otro helado?");
            System.out.println("-----------------------------------------------");
            int opcion = new Scanner(System.in).nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduzca una opcion: ");
                    System.out.println("-----------------------------------------------");
                    System.out.println("1. Cono De Chocolate (1€)");
                    System.out.println("2. Tarrina (0.50€)");
                    System.out.println("-----------------------------------------------");
                    int opcionT=new Scanner(System.in).nextInt();
                        switch(opcionT){
                            case 1:
                                a.setRecipiente("Cono");
                                System.out.println("Aqui tiene su Cono de Chocolate");
                                break;
                            case 2:
                                a.setRecipiente("Tarrina");
                                System.out.println("Aqui tiene su Tarrina");
                                break;
                        }
                break;
                case 2:
                        for(int i=0;i<3;i++){
                            System.out.println("Introduzca una opcion (Cada sabor sera 0.50€ mas a partir del primero que costara 1€): ");
                            System.out.println("-----------------------------------------------");
                            System.out.println("1. Chocolate");
                            System.out.println("2. Nata");
                            System.out.println("3. Limón");
                            System.out.println("4. Fresa");
                            System.out.println("5. Naranja");
                            System.out.println("-----------------------------------------------");
                            int opcionS=new Scanner(System.in).nextInt();
                            switch(opcionS){
                                case 1: 
                                    System.out.println("usted ha añadido el sabor Chocolate a su helado");
                                    a.setSabor("Chocolate");
                                    System.out.println("¿Quiere otro sabor?");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    int opcionN=new Scanner(System.in).nextInt();    
                                    switch(opcionN){
                                        case 1:
                                            break;
                                        case 2:
                                            n="no";
                                            break;
                                        }
                                    break;
                                case 2:
                                    System.out.println("usted ha añadido el sabor Nata a su helado");
                                    a.setSabor1("Nata");
                                    break;
                                case 3:
                                    System.out.println("usted ha añadido el sabor Limon a su helado");
                                    a.setSabor2("Limon");
                                    break;
                                case 4:
                                    System.out.println("usted ha añadido el sabor Fresa a su helado");
                                    a.setSabor3("Fresa");
                                    break;
                                case 5:
                                    System.out.println("usted ha añadido el sabor Naranja a su helado");
                                    a.setSabor4("Naranja");
                                    break;
                            }    
                        }
                    break;

            }
        }
        System.out.println(a);
    }

}
