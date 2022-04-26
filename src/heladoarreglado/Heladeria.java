/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heladeria;
import static java.lang.System.exit;
import java.util.*;
/**
 *
 * @author Raul
 */
public class Heladeria {
    private double precio;
    private int i=0;
    private String recipiente;
    private String [] sabores=new String[3];
    public Heladeria(){
        
    }

    public void setRecipiente(String recipiente) {
        this.recipiente = recipiente;
    }

    public void setPrecio() {
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
        this.sabores[i]= sabor;
        i+=1;
    }
    

    public String toString() {
        if(i==2){
            this.precio+=1.50;
            return "Aqui tiene su helado con sabores "+sabores[0]+" "+sabores[1]+" en su "+recipiente+" son "+precio;    
        }else if(i==3){
            this.precio+=2;
            return "Aqui tiene su helado con sabores "+sabores[0]+" "+sabores[1]+" "+sabores[2]+" en su "+recipiente+" son "+precio;
        }else{
            this.precio+=1;
            return "Aqui tiene su helado con sabores "+sabores[0]+" en su "+recipiente+" son "+precio;
        }
       
    }
        
    
    public static void main(String[] args) {
        int opciones=0;
        int numS=-5;
        boolean activo=true;
        Heladeria a=new Heladeria();
        int i=0;
        String n="si";
        while(n.equalsIgnoreCase("si")){
            System.out.println("Introduzca una opcion: ");
            System.out.println("-----------------------------------------------");
            System.out.println("1. ¿Donde quiere su helado?");
            System.out.println("2. ¿De que sabor quiere su helado?");
            System.out.println("-----------------------------------------------");
            int opcion = new Scanner(System.in).nextInt();
            switch(opcion){
                case 1:
                    opciones=1;
                    System.out.println("Introduzca una opcion: ");
                    System.out.println("-----------------------------------------------");
                    System.out.println("1. Cono De Chocolate (1€)");
                    System.out.println("2. Tarrina (0.50€)");
                    System.out.println("-----------------------------------------------");
                    int opcionT=new Scanner(System.in).nextInt();
                        switch(opcionT){
                            case 1:
                                a.setRecipiente("Cono");
                                a.setPrecio();
                                System.out.println("Aqui tiene su Cono de Chocolate");
                                break;
                            case 2:
                                a.setRecipiente("Tarrina");
                                a.setPrecio();
                                System.out.println("Aqui tiene su Tarrina");
                                break;
                        }
                break;
                case 2:
                    if(opciones==1){
                        
                        while(activo){
                            if(numS!=3){
                            
                            System.out.println("Introduzca una opcion (sabor 1€): ");
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
                                    numS+=1;
                                    a.setSabor("Chocolate");
                                    System.out.println("¿Quiere otro sabor?");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    int opcionN=new Scanner(System.in).nextInt();    
                                    switch(opcionN){
                                        case 1:
                                            if(i>2){
                                                n="no";
                                            } 
                                            i+=1;
                                        break;
                                        case 2:
                                            n="no";
                                            activo=false;
                                        break;
                                        }
                                break;
                                case 2:
                                    System.out.println("usted ha añadido el sabor Nata a su helado");
                                    numS+=1;
                                    a.setSabor("Nata");
                                    System.out.println("¿Quiere otro sabor?");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    int opcionC=new Scanner(System.in).nextInt();    
                                    switch(opcionC){
                                        case 1:
                                            if(i==3){
                                                n="no";
                                            } 
                                            i+=1;
                                            break;
                                        case 2:
                                            n="no";
                                            activo=false;
                                            break;
                                        }
                                break;
                                case 3:
                                    System.out.println("usted ha añadido el sabor Limon a su helado");
                                    numS+=1;
                                    a.setSabor("Limon");
                                    System.out.println("¿Quiere otro sabor?");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    int opcionX=new Scanner(System.in).nextInt();    
                                    switch(opcionX){
                                        case 1:
                                           
                                            if(i==3){
                                                n="no";
                                            } 
                                            i++;
                                            break;
                                        case 2:
                                            n="no";
                                            activo=false;
                                            break;
                                        }
                                break;
                                case 4:
                                    System.out.println("usted ha añadido el sabor Fresa a su helado");
                                    numS+=1;
                                    a.setSabor("Fresa");
                                    System.out.println("¿Quiere otro sabor?");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    int opcionZ=new Scanner(System.in).nextInt();    
                                    switch(opcionZ){
                                        case 1:
                                          
                                            if(i==3){
                                                n="no";
                                            } 
                                            i+=1;
                                            break;
                                        case 2:
                                            n="no";
                                            activo=false;
                                            break;
                                        }
                                    break;
                                case 5:
                                    System.out.println("usted ha añadido el sabor Naranja a su helado");
                                    numS+=1;
                                    a.setSabor("Naranja");
                                    System.out.println("¿Quiere otro sabor?");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    int opcionH=new Scanner(System.in).nextInt();    
                                    switch(opcionH){
                                        case 1:
                                          
                                            if(i==3){
                                                n="no";
                                            } 
                                            i+=1;
                                            break;
                                        case 2:
                                            n="no";
                                            activo=false;
                                            break;
                                        }
                                    break;
                            }
                            }else{
                        System.out.println("Máximo de Sabores alcanzado");
                    }
                          }  
                        
                    break;
                    }else{
                        System.out.println("Elige primero el recipiente");
                    }
            }
        }
        System.out.println(a);
    }
//El planteamiento del programa está mal, habría que rehacerlo por completo para arreglarlo
}
