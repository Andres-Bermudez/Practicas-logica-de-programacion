import java.util.Scanner;

public class Alumno {

     double[][] notasAlumnos = new double[4][4];

     private double nota1 = 0;
     private double nota2 = 0;
     private double nota3 = 0;

     private int alumnoSeleccionado;
     private int seleccion;

     Scanner sc = new Scanner(System.in);

     public void alumnos() {
          do {
               System.out.println("--------------------------------------");
               System.out.println("Selecciona el alumno:");
               System.out.println("1. Alumno No. 1");
               System.out.println("2. Alumno No. 2");
               System.out.println("3. Alumno No. 3");
               System.out.println("4. Alumno No. 4");
               System.out.println("0. Salir");

               alumnoSeleccionado = sc.nextInt();

               if (alumnoSeleccionado > 0 && alumnoSeleccionado < 5) {
                    operacion();
               
               } else if (alumnoSeleccionado == 0) {
                    System.exit(0);

               } else {
                    System.out.println("Opcion no disponible, intentalo nuevamente!");
               }
          } while (alumnoSeleccionado != 0);
     }

     private void operacion() {
          System.out.println("1. Ingresar notas del alumno");
          System.out.println("2. Ver notas del alumno");

          seleccion = sc.nextInt();

          if (seleccion == 1) {
               ingresarNotas();

          } else if (seleccion == 2) {
               verNotas();

          } else {
               System.out.println("Opcion no disponible, intentalo nuevamente!");
          }
     }

     private void ingresarNotas() {
          System.out.print("Ingresa la primera nota: ");
          nota1 = sc.nextDouble();

          System.out.print("Ingresa la segunda nota: ");
          nota2 = sc.nextDouble();

          System.out.print("Ingresa la tercera nota: ");
          nota3 = sc.nextDouble();

          procesoNotas();
     }

     private void procesoNotas() {
          switch (alumnoSeleccionado) {
               case 1:
                    notasAlumnos[0][0] = nota1;
                    notasAlumnos[0][1] = nota2;
                    notasAlumnos[0][2] = nota3;
                    notasAlumnos[0][3] = (notasAlumnos[0][0] + notasAlumnos[0][1] + notasAlumnos[0][2]) / 3;
                    break;
               case 2:
                    notasAlumnos[1][0] = nota1;
                    notasAlumnos[1][1] = nota2;
                    notasAlumnos[1][2] = nota3;
                    notasAlumnos[1][3] = (notasAlumnos[1][0] + notasAlumnos[1][1] + notasAlumnos[1][2]) / 3;
                    break;
               case 3:
                    notasAlumnos[2][0] = nota1;
                    notasAlumnos[2][1] = nota2;
                    notasAlumnos[2][2] = nota3;
                    notasAlumnos[2][3] = (notasAlumnos[2][0] + notasAlumnos[2][1] + notasAlumnos[2][2]) / 3;
                    break;
               case 4:
                    notasAlumnos[3][0] = nota1;
                    notasAlumnos[3][1] = nota2;
                    notasAlumnos[3][2] = nota3;
                    notasAlumnos[3][3] = (notasAlumnos[3][0] + notasAlumnos[3][1] + notasAlumnos[3][2]) / 3;
                    break;
          }
     }

     private void verNotas() {
          switch (alumnoSeleccionado) {
               case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("Notas alumno No. 1:");
                    System.out.println("1ra Nota: " + notasAlumnos[0][0]);
                    System.out.println("2da Nota: " + notasAlumnos[0][1]);
                    System.out.println("3ra Nota: " + notasAlumnos[0][2]);
                    System.out.println("Promedio: " + notasAlumnos[0][3]);
                    System.out.println("--------------------------------------");
                    break;
                    
               case 2:
                    System.out.println("--------------------------------------");
                    System.out.println("Notas alumno No. 2:");
                    System.out.println("1ra Nota: " + notasAlumnos[1][0]);
                    System.out.println("2da Nota: " + notasAlumnos[1][1]);
                    System.out.println("3ra Nota: " + notasAlumnos[1][2]);
                    System.out.println("Promedio: " + notasAlumnos[1][3]);
                    System.out.println("--------------------------------------");
                    break;
                    
               case 3:
                    System.out.println("--------------------------------------");
                    System.out.println("Notas alumno No. 3:");
                    System.out.println("1ra Nota: " + notasAlumnos[2][0]);
                    System.out.println("2da Nota: " + notasAlumnos[2][1]);
                    System.out.println("3ra Nota: " + notasAlumnos[2][2]);
                    System.out.println("Promedio: " + notasAlumnos[2][3]);
                    System.out.println("--------------------------------------");
                    break;
                    
               case 4:
                    System.out.println("--------------------------------------");
                    System.out.println("Notas alumno No. 4:");
                    System.out.println("1ra Nota: " + notasAlumnos[3][0]);
                    System.out.println("2da Nota: " + notasAlumnos[3][1]);
                    System.out.println("3ra Nota: " + notasAlumnos[3][2]);
                    System.out.println("Promedio: " + notasAlumnos[3][3]);
                    System.out.println("--------------------------------------");
                    break;
          }
     }
}
