import java.util.Scanner;

public class HorarioFuncionemnto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana (Ex: seg, ter, qua, etc): ");
        String diaSemana = entrada.nextLine();

        System.out.print("Digite o mês (1 à 12): ");
        int mes = entrada.nextInt();

        //switch express(a partir do java14), consigo tambem usar logica
        String horarioFuncionamento = switch (diaSemana){
            case "seg" -> {
                if (mes == 12) {
                    yield "08:00 as 16:00";
                }
                yield "Fechado";
            }
            case "ter", "qua", "qui", "sex" -> "08:00 as 18:00";
            case "sab", "dom" -> "08:00 as 12:00";
            default -> "Dia invalido";
        };

       /* switch (diaSemana){
            case "seg": horarioFuncionamento = "Fechado";
            break;
            case "ter":
            case "qua":
            case "qui":
            case "sex":
                horarioFuncionamento = "08:00 as 18:00";
            break;

            case "sab":
            case "dom":
                horarioFuncionamento = "08:00 as 12:00";
            break;
            default: horarioFuncionamento = "Dia invalido";
        }*/

        //novo jeito do switch a partir do Java14, onde não precisa usar o break

        /*String horarioFuncionamento = null;
        switch (diaSemana){
            case "seg" -> horarioFuncionamento = "Fechado";
            case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 as 18:00";
            case "sab", "dom" -> horarioFuncionamento = "08:00 as 12:00";
            default -> horarioFuncionamento = "Dia invalido";
        }*/

        System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
    }

}
