import java.time.LocalTime;

public class Saudacao {
    public static String saudacao() {
        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour();

        if (hora >= 5 && hora < 12) {
            return "Bom dia";
        } else if (hora >= 12 && hora <= 18) {
            return "Boa tarde";
        } else if (hora >=19 && hora <=23) {
            return "Boa noite";
        } else{ return "Vai Dormir";
      }
 }

    public static void main(String[] args) {
        System.out.println(saudacao());
    }
}
