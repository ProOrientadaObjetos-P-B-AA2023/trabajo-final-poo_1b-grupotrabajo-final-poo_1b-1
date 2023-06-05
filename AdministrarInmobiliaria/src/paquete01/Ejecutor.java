package paquete01;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import paquete06.Casa;
import paquete06.Departamento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean op = true;
        try {
            Formatter casa = new Formatter("casas.dat");
            Formatter departamento = new Formatter("departamentos.dat");
            Formatter barrio = new Formatter("barrios.dat");
            Formatter propietario = new Formatter("propietarios.dat");
            Formatter ciudad = new Formatter("ciudades.dat");
            Formatter constructora = new Formatter("constructoras.dat");
            casa.close();
            departamento.close();
            barrio.close();
            propietario.close();
            ciudad.close();
            constructora.close();
            ArrayList<Departamento> departamentos = new ArrayList<>();
            ArrayList<Casa> casas = new ArrayList<>();
            while (op) {
                try {
                    System.out.println("\nIngresar datos [1]");
                    System.out.println("\nMostrar datos  [2]");
                    int opc = entrada.nextInt();
                    switch (opc) {
                        case 1:
                            try {
                            Formatter casas1 = new Formatter("casas.dat");
                            Formatter departamentos1 = new Formatter("departamentos.dat");
                            Formatter barrios = new Formatter(new FileWriter("barrios.dat", true));
                            Formatter propietarios = new Formatter(new FileWriter("propietarios.dat", true));
                            Formatter ciudades = new Formatter(new FileWriter("ciudades.dat", true));
                            Formatter constructoras = new Formatter(new FileWriter("constructoras.dat", true));
                            System.out.println("\nIngresar el nombre del barrio y una diferencia");
                            barrios.format("%s; %s%n", entrada.next(), entrada.next());
                            System.out.println("Ingresar nombres, apellidos y el id");
                            propietarios.format("%s; %s; %s%n", entrada.next(), entrada.next(), entrada.next());
                            System.out.println("Ingresar nombre de la ciudad y la provincia");
                            ciudades.format("%s; %s%n", entrada.next(), entrada.next());
                            System.out.println("Ingresar nombre de la constructora y el id de la empresa");
                            constructoras.format("%s; %s%n", entrada.next(), entrada.next());
                            System.out.println("Ingresar el precio de los metros cuadrados, numero de metros cuadrados y numero de cuartos");
                            casas.add(new Casa(entrada.nextDouble(), entrada.nextDouble(), entrada.nextInt()));
                            for (Casa c : casas) {
                                c.calcularCostoFinal();
                            }
                            System.out.println("Ingresar el precio de los metros cuadrados, numero de metros cuadrados, valor de la Alicuota, ubicacion y nombre del edificio");
                            departamentos.add(new Departamento(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble(), entrada.next(), entrada.next()));
                            for (Departamento de : departamentos) {
                                de.calcularCostoFinal();
                            }
                            barrios.close();
                            propietarios.close();
                            ciudades.close();
                            constructoras.close();
                            Scanner lectura1 = new Scanner(new File("barrios.dat"));
                            Scanner lectura2 = new Scanner(new File("propietarios.dat"));
                            Scanner lectura3 = new Scanner(new File("ciudades.dat"));
                            Scanner lectura4 = new Scanner(new File("constructoras.dat"));
                            int i = 0;
                            while (lectura1.hasNext()) {
                                String barr[] = lectura1.nextLine().split(";");
                                String prop[] = lectura2.nextLine().split(";");
                                String ciud[] = lectura3.nextLine().split(";");
                                String cons[] = lectura4.nextLine().split(";");
                                casas.format("%s; %s; %s; %s; %.2f; %.2f; %.2f; %d%n", barr[1], prop[0], ciud[0], cons[0], casa.get(i).getCostoFinal(), casa.get(i).getPrecioPorMetroCuadrado(), casa.get(i).getNumeroMetrosCuadrados(), casa.get(i).getNumeroCuartos());
                                departamentos.format("%s; %s; %s; %s; %.2f; %.2f; %.2f; %.2f; %s; %s%n", barr[1], prop[0], ciud[0], cons[0], departamento.get(i).getCostoFinal(), departamento.get(i).getPrecioMetroCuadrado(), departamento.get(i).getNumeroMetrosCuadrados(), departamento.get(i).getValorAlicuotaMensual(), departamento.get(i).getUbicacionDepartamentoE(), departamento.get(i).getNombreEdificio());
                                i++;
                                if (i + 1 == departamentos.size()) {
                                    break;
                                }
                            }
                            casas1.close();
                            departamentos1.close();
                            lectura1.close();
                            lectura2.close();
                            lectura3.close();
                            lectura4.close();
                        } catch (Exception e) {
                            System.out.println("\nError");
                            System.out.println("\nIngrese nuevamente");
                            entrada.nextLine();
                        }
                        break;
                        case 2:
                            Scanner lecturacasa = new Scanner(new File("casas.dat"));
                            Scanner lecturadepartamento = new Scanner(new File("departamentos.dat"));
                            Scanner lec = new Scanner(new File("barrios.dat"));
                            Scanner lec2 = new Scanner(new File("propietarios.dat"));
                            Scanner lec3 = new Scanner(new File("ciudades.dat"));
                            Scanner lec4 = new Scanner(new File("constructoras.dat"));
                            System.out.println("Casas:");
                            while (lecturacasa.hasNext()) {
                                System.out.println(lecturacasa.nextLine());
                            }
                            System.out.println("Departamento:");
                            while (lecturadepartamento.hasNext()) {
                                System.out.println(lecturadepartamento.nextLine());
                            }
                            System.out.println("Barrios:");
                            while (lec.hasNext()) {
                                System.out.println(lec.nextLine());
                            }
                            System.out.println("Propietarios:");
                            while (lec2.hasNext()) {
                                System.out.println(lec2.nextLine());
                            }
                            System.out.println("Ciudades:");
                            while (lec3.hasNext()) {
                                System.out.println(lec3.nextLine());
                            }
                            System.out.println("Constructoras:");
                            while (lec4.hasNext()) {
                                System.out.println(lec4.nextLine());
                            }
                            op = false;
                            lecturacasa.close();
                            lecturadepartamento.close();
                            lec.close();
                            lec2.close();
                            lec3.close();
                            lec4.close();
                            break;

                    }
                } catch (Exception e) {
                    System.out.println("\nError");
                    entrada.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
