//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class TipoCertamen1 {
    public static void main(String[] args){

        Scanner ing = new Scanner(System.in);
        String opcion=null,nombre="",rut="",sexo="",previson="";
        String[] pacienteingresado =new String[4];
        int valor = 25000;
        String[] pacientes = {"14835165-6","12478965-8","17854369-K","07072365-4", "06854369-K"};
        String[] prevision = {"FNS A 0%","FNS B 25%","FNS C 50%","FNS D 75%","ISAPRES 90%"};

        do{
            System.out.println("Ingrese datos del paciente");
            System.out.println("Ingrese nombre: ");
            nombre = ing.nextLine();
            System.out.println("Ingrese rut con guion y sin puntos: ");
            rut = ing.nextLine();
            System.out.println("Ingrese sexo del paciente (femenino/masculino): ");
            sexo = ing.nextLine();
            System.out.println("Ingrese prevision: ");
            for (int i=0; i<prevision.length;i++){
                System.out.println(i+1+"-"+prevision[i]);

            }

            System.out.println("Elija una opcion del 1 al 5: ");
            int opcionprevision = ing.nextInt();
            ing.nextLine();

            pacienteingresado = new String[]{nombre, rut, sexo, prevision[opcionprevision - 1]};
            for (int i=0; i<pacientes.length;i++){
                if (pacienteingresado[1].equals(pacientes[i])){
                    valor = calcularValor(pacienteingresado[3]);
                    break;
                }
                else {
                    valor = 25000;
                }
            }

            System.out.println("************* CONSULTA DE URGENCIA *************");
            System.out.println("Nombre paciente: "+ pacienteingresado[0]);
            System.out.println("Ssxo: "+ pacienteingresado[2]);
            System.out.println("Sistema Salud"+pacienteingresado[3]);
            System.out.println("Valor a cancelar: "+valor);

            System.out.println("¿Desea continuar? (si/no)");
            opcion = ing.nextLine().toLowerCase();
        } while (opcion.equals("si"));


    }
    public static int calcularValor(String prevision){
        int valor=0,monto=25000;
        if (prevision.equals("FNS A 0%")){
            valor = 0;
        }
        else if(prevision.equals("FNS B 25%")){
            valor = (int) (monto * 0.25);
        }
        else if(prevision.equals("FNS C 50%")){
            valor = (int) (monto * 0.5);
        }
        else if(prevision.equals("FNS D 75%")){
            valor = (int) (monto * 0.7);
        }
        else if(prevision.equals("ISAPRES 90%")) {
            valor = (int) (monto * 0.9);
        }
        return valor;
    }
}