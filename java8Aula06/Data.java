package java8Aula06;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasParis = LocalDate.of(2024, Month.JULY, 5);

        int anos = olimpiadasParis.getYear() - hoje.getYear();
        System.out.println(anos);

//        Period periodo = Period.between(hoje, olimpiadasParis);
//        System.out.println(periodo.getDays());

        LocalDate olimpiadas2028 = olimpiadasParis.plusYears(4);

        System.out.println(olimpiadas2028);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm ");

        String valorFormatado = olimpiadas2028.format(formatador);
        System.out.println(valorFormatado);

//        LocalDateTime agora = LocalDateTime.now();
//        System.out.println(agora.format(formatadorComHora));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

        LocalDate agora = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        int anos2 = dataFutura.getYear() - agora.getYear();
        System.out.println(anos2);
    }
}
