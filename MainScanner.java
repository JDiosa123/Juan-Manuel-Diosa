import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args){

        Scanner sal = new Scanner(System.in);
        System.out.println("ingrese el salari sin ajuste: ");
        float salarioSinAjuste = sal.nextFloat();
        System.out.println("ingrese el porcentaje del aumento(si es el 15% ingresar 0.15): ");
        float aumento = sal.nextFloat();
        EjercicioIF pruebaScanner = new EjercicioIF(salarioSinAjuste, salarioSinAjuste, 0);
        float salarioAjustado = pruebaScanner.calcularSalario();
        System.out.println("el salario es igual a :"+salarioAjustado);
        sal.close();


    }
}
