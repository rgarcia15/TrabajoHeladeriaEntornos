package helado2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author iker3
 */
public class Helado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean bucle = true;
       double precio=0;
       int i=0;
       String [] tipo ={"cono","tarrina"};
       String [] sabor ={"fresa","nata","chocolate","naranja","limon","pistacho"};
       String [] datos= new String[4];
       System.out.println("Bienvenido a la heladería Antonio y amigos :)");
       while (bucle){
            System.out.println("¿Que desea un cono o una tarrina?");
            String c=new Scanner (System.in).nextLine();
            if (c.equalsIgnoreCase(tipo[0])||c.equalsIgnoreCase(tipo[1])){
                if (c.equalsIgnoreCase(tipo[0])){
                    precio+=1;
                }else{
                    precio+=0.5;
                }
                while (bucle){
                    System.out.println("Los sabores disponibles son: "+Arrays.toString(sabor));
                    System.out.println("¿Qué sabor le quieres poner al helado?");
                    String s=new Scanner (System.in).nextLine();
                    if (s.equalsIgnoreCase(sabor[0])||s.equalsIgnoreCase(sabor[1])||s.equalsIgnoreCase(sabor[2])||s.equalsIgnoreCase(sabor[3])||s.equalsIgnoreCase(sabor[4])||s.equalsIgnoreCase(sabor[5])){
                        datos[i]=s;
                        i++;
                        System.out.println("¿Quieres más sabores?");
                        String cont=new Scanner (System.in).nextLine();
                        if (i==3){
                            precio+=2;
                            System.out.println("Lo siento, has llegado al máximo de sabores de helados ");
                            System.out.println("Su helado es de tipo "+c+" y sus sabores son "+datos[0]+" "+datos[1]+" "+datos[2]);
                            precio=precio+(precio*0.1);
                            System.out.println("El precio a pagar es de"+precio);
                            System.out.print("Por favor introduzca el pago: ");
                            double pago= new Scanner(System.in).nextDouble();
                            System.out.println("");
                            if (pago<precio){
                                while(bucle){ 
                                    System.out.println("No me ha dado suficiente dinero");
                                    double pago2=new Scanner(System.in).nextDouble();
                                    if (pago2>precio){
                                        System.out.println("Aquí tiene su vuelta "+(pago2-precio));
                                        System.out.println("Hasta pronto, muchas gracias");
                                        bucle=false;
                                    }
                                }
                            }else{
                                System.out.println("Aquí tiene su vuelta "+(pago-precio));
                                System.out.println("Hasta pronto, muchas gracias");
                            }
                            bucle=false;
                        }else{
                            if (cont.equalsIgnoreCase("Si")){
                                System.out.println("Vale....");
                            }else if (i==2&&cont.equalsIgnoreCase("No")){
                                precio+=1.5;
                                System.out.println("El helado es de tipo "+c+" y su sabores son "+datos[0]+" "+datos[1]);
                                precio=precio+(precio*0.1);
                                System.out.println("El precio a pagar es de "+precio);
                                System.out.print("Por favor introduzca el pago: ");
                                double pago= new Scanner(System.in).nextDouble();
                                System.out.println("");
                                if (pago<precio){
                                    while(bucle){ 
                                        System.out.println("No me ha dado suficiente dinero");
                                        double pago2=new Scanner(System.in).nextDouble();
                                        if (pago2>precio){
                                            System.out.println("Aquí tiene su vuelta "+(pago2-precio));
                                            System.out.println("Hasta pronto, muchas gracias");
                                            bucle=false;
                                        }
                                    }
                                }else{
                                    System.out.println("Aquí tiene su vuelta "+(pago-precio));
                                    System.out.println("Hasta pronto, muchas gracias");
                                }
                                bucle=false;
                            }else if (i==1&&cont.equalsIgnoreCase("No")){
                                precio+=1;
                                System.out.println("El helado es de tipo "+c+" y su sabor de helado es "+datos[0]);
                                System.out.print("Por favor introduzca el pago: ");
                                precio=precio+(precio*0.1);
                                System.out.println("El precio a pagar es de "+precio);
                                double pago= new Scanner(System.in).nextDouble();
                                if (pago<precio){
                                    while(bucle){ 
                                        System.out.println("No me ha dado suficiente dinero");
                                        double pago2=new Scanner(System.in).nextDouble();
                                        if (pago2>precio){
                                            System.out.println("Aquí tiene su vuelta "+(pago2-precio));
                                            System.out.println("Hasta pronto, muchas gracias");
                                            bucle=false;
                                        }
                                    }
                                }else{
                                    System.out.println("Aquí tiene su vuelta "+(pago-precio));
                                    System.out.println("Hasta pronto, muchas gracias");
                                }
                                
                                bucle=false;
                            }
                        }
                    }else{
                        System.out.println("Lo siento ese sabor no lo tenemos, por favor vuelve a pedir los sabores del helado");
                    }
                }    
            }else{
                System.out.println("Lo siento ese tipo de helado no lo tenemos");
            }
        }
    }
    }
    