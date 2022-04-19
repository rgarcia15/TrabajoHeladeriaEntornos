/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heladeria;
import java.util.*;

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
       String[] sabor=new String[3];
        int cont=0;
        boolean si=true;
        String manera="";
        double precio=0;
        while(si){
           System.out.println("Bienvenido a la heladeria, como desea tomar su helado?(1=tarrina/2=cono)");
           int n=new Scanner(System.in).nextInt();
           
           if(n==1){
               manera="tarrina";
               precio+=1;
               si=false;
           }
           if(n==2){
               manera="cono";
               precio+=1.5;
               si=false;
           }
           if((n<1)||(n>2)){
               System.out.println("ERROR: No ha introducido una opcion valida");
           }
        }
        
        si=true;
        int i=0;
        while(si){
            i++;
            System.out.println("Por favor elija una de las opciones a continuacion(maximo 3 sabores)");
            System.out.println("1-Añadir sabor nata");
            System.out.println("2-Añadir sabor fresa");
            System.out.println("3-Añadir sabor chocolate");
            System.out.println("4-Añadir sabor naranja");
            System.out.println("5-Añadir sabor limon");
            System.out.println("6-Eliminar sabor");
            
            if(i>=2){
                System.out.println("7-terminar helado");
            }
            
            int op=new Scanner(System.in).nextInt();
            switch(op){
                case 1: 
                    String nombre="nata";
                    sabor[cont]=nombre;
                    cont++;
                    precio+=1;
                    break;
                    
                case 2:
                    nombre="fresa";
                    sabor[cont]=nombre;                      
                    cont++;
                    precio+=1;
                    break;
                case 3:
                    nombre="chocolate";
                    sabor[cont]=nombre;                      
                    cont++;
                    precio+=1;
                    break;
                case 4:
                    nombre="naranja";
                    sabor[cont]=nombre;                      
                    cont++;
                    precio+=1;
                    break;
                case 5:
                    nombre="limon";
                    sabor[cont]=nombre;                      
                    cont++;
                    precio+=1;
                    break;
                case 6:
                    cont--;
                    precio-=1;
                    break;
                case 7:
                if(i>=2){
                    System.out.println("Su helado de "+manera+" tiene los sabores de: "+Arrays.toString(sabor)+"el helado costara: "+precio+"€");
                    break;
                }else{
                    System.out.println("Numero Incorrecto");
                    break;
                }
            }
            if(op==7){
                si=false;
            }
            else if(cont==3){
                System.out.println("Usted a llegado al maximo de sabores. Desea elmininar algun sabor?(si=1/no=2)");
                int e=new Scanner(System.in).nextInt();
                if(e==1)
                    cont--;
                    precio-=1;
                if(e==2){
                    precio+=1;
                    System.out.println("Su helado de "+manera+" tiene los sabores de: "+Arrays.toString(sabor)+" el helado costara: "+precio+"€");
                    si=false;
                }
            }
        }
        
    }
    
}

