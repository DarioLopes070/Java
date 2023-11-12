import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulacaoStringData {
    public static void main(String[] args) {
        String name = "Dário";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.length());
        String otherName = "Dário";
//        System.out.println(name.equals(otherName));
//        System.out.println(name.equalsIgnoreCase(otherName));

    //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
//        System.out.println(hoje);
//        System.out.println(hoje.getDayOfWeek());
//        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL ,brasil));
//        System.out.println(hoje.getDayOfMonth());
//        System.out.println(hoje.getDayOfYear());
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL ,brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        int horarioAtual = agora.getHour();
//        System.out.println(agora.getHour());
        if(horarioAtual >= 0 && horarioAtual < 12){
            saudacao="Bom Dia!";
        }else if(horarioAtual >= 12 && horarioAtual < 18){
            saudacao="Boa Tarde!";
        }else if(horarioAtual >= 18 && horarioAtual < 24){
            saudacao="Boa Noite!";
        }else{
            saudacao = "Olá.";
        }
        int minutoAtual = agora.getMinute();
        System.out.printf("Olá, %s. Hoje é %s, %s%n", name, diaSemana, saudacao.toUpperCase());
        System.out.printf("O horário atual é %d:%d", horarioAtual, minutoAtual);
    }
}
