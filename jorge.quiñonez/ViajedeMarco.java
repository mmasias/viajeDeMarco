import java.lang.Math;
import java.text.DecimalFormat;
public class ViajedeMarco{
    public static void main(String[] args){

        int DistanciaDeLaMadre, Dia;
        double VelocidadDeMarco, TiempoDeMarco, ProbabilidadDeLluvia, ProbabilidadDelMono, DistanciaTotalDeMarco, DistanciaRecorridaPorMarco, DistanciaEntreEllos;

        System.out.println("Marco inicia su viaje en busca de su madre.");
        System.out.println("La madre de Marco se encuentra a 350Km de distancia.");
        System.out.println("");

        Dia = 0;
        DistanciaDeLaMadre = 350;
        DistanciaTotalDeMarco = 0;
        DistanciaEntreEllos = DistanciaDeLaMadre - DistanciaTotalDeMarco;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("------------------------------------");
        System.out.println("");
        
        while(DistanciaEntreEllos > 0){
            Dia = Dia + 1;
            DistanciaDeLaMadre = DistanciaDeLaMadre + 80;

            VelocidadDeMarco = (Math.random()*(15-10))+10;
            TiempoDeMarco = (Math.random()*(10-8))+8;

            ProbabilidadDeLluvia = (Math.random()*(100-0)+0);

            if(ProbabilidadDeLluvia <=10){
                VelocidadDeMarco = VelocidadDeMarco * 0.25;
            }
            else if (ProbabilidadDeLluvia <=40){
                VelocidadDeMarco = VelocidadDeMarco *0.75;
            }

            ProbabilidadDelMono = (Math.random()*(100-0)+0);

            if(ProbabilidadDelMono <=15){
                TiempoDeMarco = TiempoDeMarco - 2;
            }
            else if(ProbabilidadDelMono <=35){
                VelocidadDeMarco = VelocidadDeMarco * 0.90;
            }
            else if(ProbabilidadDelMono <=15 & ProbabilidadDelMono <=35){
                VelocidadDeMarco = VelocidadDeMarco * 0.90;
                TiempoDeMarco = TiempoDeMarco - 2;
            }

            DistanciaRecorridaPorMarco = TiempoDeMarco * VelocidadDeMarco;
            
            DistanciaTotalDeMarco = DistanciaTotalDeMarco + DistanciaRecorridaPorMarco;

            DistanciaEntreEllos = DistanciaDeLaMadre - DistanciaTotalDeMarco;

            System.out.println("DIA " + Dia);
            System.out.println("");

            if(ProbabilidadDeLluvia <=10){
                System.out.println("Este dia llovio muy fuerte");
                System.out.println("");
            }else if(ProbabilidadDeLluvia <=40){
                System.out.println("Hoy me ha llovio un poco");
                System.out.println("");
            }else{
                System.out.println("Hoy hizo un buen dia");
                System.out.println("");
            }

            if(ProbabilidadDelMono <=15){
                System.out.println("Amedio se las piro y tuve que ir a buscarlo");
                System.out.println("");
            }
            else if(ProbabilidadDelMono <=35){
                System.out.println("A Amedio le falta ejercicio, se canso y tuve que cargarlo");
                System.out.println("");
            }
            else if(ProbabilidadDelMono <=15 & ProbabilidadDelMono <=35){
                System.out.println("Hoy Amedio se escapo y se canso, me dio muchos problemas >:/");
                System.out.println("");
            }

            DecimalFormat df = new DecimalFormat("0.00");

            System.out.println("Pude avanzar " + df.format(TiempoDeMarco) + " horas a " + df.format(VelocidadDeMarco) + "Km/h");
            System.out.println("Al final del dia logre recorrer " + df.format(DistanciaRecorridaPorMarco) + "Km" );
            System.out.println("");

            if(DistanciaDeLaMadre > DistanciaTotalDeMarco){
               System.out.println("Mi madre avanzo 80Km");
               System.out.println(""); 
               System.out.println("La distancia entre nosotros es de " + df.format(DistanciaEntreEllos) + "Km");
            }
            
            System.out.println("--------------------------------------------------------");

        }
        System.out.println("Logre alcanzar a mi madre, estoy muy feliz");
        System.out.println("FIN DEL DIARIO");
    }
}