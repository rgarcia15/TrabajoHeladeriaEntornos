/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladoarreglado;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class HeladoArreglado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float precio=0;
        int numSabores=0;
        //int numHelados=0;
        int saboresRestantes=0;
        String[] pedidoHelado= new String[5];
        boolean activo=true;
        boolean activo2=true;
        boolean activo3=true;
        boolean activo4=true;
        while(activo){
            try{
                System.out.println("HELADERÍA");
                System.out.println("1. Tipo Helado");
                System.out.println("2. Elegir Sabor");
                System.out.println("3. Añadir Sabor Extra");
                System.out.println("4. Terminar Pedido");

                System.out.print("Elige una opción: ");
                int option=new Scanner(System.in).nextInt();
                switch(option){
                    case 1:
                        //if(numHelados==1){
                          //  System.out.println("Su helado ya está creado");
                        //}else{
                         //   System.out.println("¿Que tipo de helado desea (cono/tarrina)?");
                       // String tipo=new Scanner(System.in).nextLine();
                     //   tipo.toLowerCase();
                   //     pedidoHelado[0]=tipo;
                 //       if(tipo.equals("cono")){
               //             precio+= 1;
             //           }else if(tipo.equals("tarrina")){
           //                 precio+=0.50;
         //               }
       //                 numHelados+=1;
     //                   }
                        if(activo2){
                        System.out.println("1 - Cono");
                        System.out.println("2 - Tarrina");
                        while(activo2){
                            try{
                                System.out.print("Elige una opción: ");
                                int option2=new Scanner(System.in).nextInt();
                                switch(option2){
                                    case 1:
                                        System.out.println("Cono elegido");
                                        precio+= 1;
                                        pedidoHelado[0]="Cono";
                                        activo2=false;
                                    break;
                                    case 2:
                                        System.out.println("Tarrina elegida");
                                        precio+= 0.50;
                                        pedidoHelado[0]="Tarrina";
                                        activo2=false;
                                    break;
                                    default:
                                        System.out.println("Opción Invalida");
                                    break;
                                }
                            }catch (InputMismatchException e){
                                System.out.println("Elige una de las opciones");
                            }    
                        }
                        }else{
                            System.out.println("Tipo de Recipiente Elegido");
                        }
                    break;
                    case 2:
                        if(activo3){
    //                        System.out.println("¿Que sabor de helado desea (fresa/nata/chocolate/naranja/limón)?");
      //                      String sabor1=new Scanner(System.in).nextLine();
        //                    pedidoHelado[1]=sabor1;
          //                  numSabores=1;
            //                precio+=1;
                            System.out.println("Sabores de Helado:");
                            System.out.println("1 - Fresa");
                            System.out.println("2 - Nata");
                            System.out.println("3 - Chocolate");
                            System.out.println("4 - Naranja");
                            System.out.println("5 - Limón");
                            System.out.println("6 - Cancelar");
                            while(activo3){
                                try{
                                    System.out.print("Elige una opción: ");
                                    int option2=new Scanner(System.in).nextInt();
                                    switch(option2){
                                        case 1:
                                            System.out.println("Fresa elegida");
                                            precio+= 1;
                                            pedidoHelado[1]="Fresa";
                                            activo3=false;
                                        break;
                                        case 2:
                                            System.out.println("Nata elegida");
                                            precio+= 1;
                                            pedidoHelado[1]="Nata";
                                            activo3=false;
                                        break;
                                        case 3:
                                            System.out.println("Chocolate elegido");
                                            precio+= 1;
                                            pedidoHelado[1]="Chocolate";
                                            activo3=false;
                                        break;
                                        case 4:
                                            System.out.println("Naranja elegida");
                                            precio+= 1;
                                            pedidoHelado[1]="Naranja";
                                            activo3=false;
                                        break;
                                        case 5:
                                            System.out.println("Limón elegida");
                                            precio+= 1;
                                            pedidoHelado[1]="Limón";
                                            activo3=false;
                                        break;
                                        case 6:
                                            System.out.println("Cancelando");
                                            activo3=false;
                                        break;
                                        default:
                                            System.out.println("Opción Invalida");
                                        break; 
                                    }
                                }catch (InputMismatchException e){
                                    System.out.println("Opción Invalida");
                                }    
                            }
                        }else{
                            System.out.println("Sabor principal elegido");
                        }
                    break;
                    case 3:
                        if(saboresRestantes==2) {
                            System.out.println("No puede añadir más sabores a su Helado");
                        }
                        if(saboresRestantes==1){
                            activo4=true;
                            System.out.println("Sabores de Helado:");
                            System.out.println("1 - Fresa");
                            System.out.println("2 - Nata");
                            System.out.println("3 - Chocolate");
                            System.out.println("4 - Naranja");
                            System.out.println("5 - Limón");
                            System.out.println("6 - Cancelar");
                            while(activo4){
                                try{
                                    System.out.print("Elige una opción (1 restante): ");
                                    int option2=new Scanner(System.in).nextInt();
                                    switch(option2){
                                        case 1:
                                            saboresRestantes++;
                                            System.out.println("Fresa elegida");
                                            precio+= 0.50;
                                            pedidoHelado[3]="Fresa";
                                            activo4=false;
                                        break;
                                        case 2:
                                            saboresRestantes++;
                                            System.out.println("Nata elegida");
                                            precio+= 0.50;
                                            pedidoHelado[3]="Nata";
                                            activo4=false;
                                        break;
                                        case 3:
                                            saboresRestantes++;
                                            System.out.println("Chocolate elegido");
                                            precio+= 0.50;
                                            pedidoHelado[3]="Chocolate";
                                            activo4=false;
                                        break;
                                        case 4:
                                            saboresRestantes++;
                                            System.out.println("Naranja elegida");
                                            precio+= 0.50;
                                            pedidoHelado[3]="Naranja";
                                            activo4=false;
                                        break;
                                        case 5:
                                            saboresRestantes++;
                                            System.out.println("Limón elegida");
                                            precio+= 0.50;
                                            pedidoHelado[3]="Limón";
                                            activo4=false;
                                        break;
                                        case 6:
                                            System.out.println("Cancelando");
                                            activo4=false;
                                        break;
                                        default:
                                            System.out.println("Opción Invalida");
                                        break; 
                                    } 
                                }catch (InputMismatchException e){
                                    System.out.println("Opción Invalida");
                                }
                            }
                        }
                        if(saboresRestantes==0){
                            System.out.println("Sabores de Helado:");
                            System.out.println("1 - Fresa");
                            System.out.println("2 - Nata");
                            System.out.println("3 - Chocolate");
                            System.out.println("4 - Naranja");
                            System.out.println("5 - Limón");
                            System.out.println("6 - Cancelar");
                            while(activo4){
                                try{
                                    System.out.print("Elige una opción (2 restantes): ");
                                    int option2=new Scanner(System.in).nextInt();
                                    switch(option2){
                                        case 1:
                                            saboresRestantes++;
                                            System.out.println("Fresa elegida");
                                            precio+= 0.50;
                                            pedidoHelado[2]="Fresa";
                                            activo4=false;
                                        break;
                                        case 2:
                                            saboresRestantes++;
                                            System.out.println("Nata elegida");
                                            precio+= 0.50;
                                            pedidoHelado[2]="Nata";
                                            activo4=false;
                                        break;
                                        case 3:
                                            saboresRestantes++;
                                            System.out.println("Chocolate elegido");
                                            precio+= 0.50;
                                            pedidoHelado[2]="Chocolate";
                                            activo4=false;
                                        break;
                                        case 4:
                                            saboresRestantes++;
                                            System.out.println("Naranja elegida");
                                            precio+= 0.50;
                                            pedidoHelado[2]="Naranja";
                                            activo4=false;
                                        break;
                                        case 5:
                                            saboresRestantes++;
                                            System.out.println("Limón elegida");
                                            precio+= 0.50;
                                            pedidoHelado[2]="Limón";
                                            activo4=false;
                                        break;
                                        case 6:
                                            System.out.println("Sabor principal elegido");
                                            activo4=false;
                                        break;
                                        default:
                                            System.out.println("Opción Invalida");
                                        break; 
                                    }
                                }catch (InputMismatchException e){
                                    System.out.println("Opción Invalida");
                                }
                            }    
                        }
                    break;
                    case 4:
                        String precio2=precio+"€";
                        pedidoHelado[4]=precio2;
                        activo=false;
                        for(int i=0; i<5; i++){
                            if(pedidoHelado[i]==null){
                                pedidoHelado[i]="Vacío";
                            }
                        }
                        System.out.println(Arrays.toString(pedidoHelado));
                    break;
                    default:
                        System.out.println("Opción Invalida");
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Opción Invalida");
            }
        }
    }
    
}
