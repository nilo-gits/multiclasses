import java.util.Scanner;

public class mainimc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso = 0.0, altura = 0.0, Imc = 0.0;
        String resultado = " ", nome = "  ";

        System.out.println(" PROGRAMA PARA CALCULAR O IMC DO PACIENTE");
        System.out.println(" Digite o nome do paciente: ");
        nome = sc.nextLine();
        System.out.println("Digite o peso do paciente: ");
        peso = sc.nextDouble();
        System.out.println("Digite a altura do paciente: ");
        altura = sc.nextDouble();

        Imc = imc.calcularimc(peso,altura);
        resultado = imc.classificarImc(Imc);
        System.out.printf("O peso do paciente é %.2f",resultado);
        sc.close();
    }
}
