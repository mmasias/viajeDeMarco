import java.util.Random;
public class solucion{
    public static void main(String[] args) {
        System.out.println("DIARIO DEL VIAJE DE MARCO\n=========================");
        double distancia = 350;
        int dia = 1;
        while (distancia > 0) {
            Random r = new Random();
            double velocidadMarco = 10 + (15 - 10) * r.nextDouble();
            double horasMarco = 8 + (10 - 8) * r.nextDouble();
            double velocidadMama = 6 + (9 - 6) * r.nextDouble();
            double horasMama = 6 + (9 - 6) * r.nextDouble();
            double probabilidadClimaMarco = r.nextDouble();
            double probabilidadClimaMama = r.nextDouble();
            double probabilidadMonoCansado = r.nextDouble();
            double probabilidadMonoPerdido = r.nextDouble();

            System.out.println("DIA " + dia);

            //Lluvia fuerte
            if(probabilidadClimaMarco>=0.9){
                velocidadMarco *= 0.25;
                System.out.println("¡Ha llovido muchísimo para Marco!"); 
            }
            //Lluvia media
            else if (probabilidadClimaMarco >=0.6){
                velocidadMarco *= 0.75; 
                System.out.println("Ha llovido un poco para Marco"); 
            }
            //Buen clima
            else{
                System.out.println("Ha hecho un buen día para Marco!"); 
            }

            if(probabilidadMonoCansado >=0.75){
                velocidadMarco *=0.90;
                System.out.println("Marco reduce su velocidad porque el mono Amedio se ha cansado");
            }
            if(probabilidadMonoPerdido >=0.85){
                horasMarco -=2;
                System.out.println("Marco pierde tiempo buscando a Amedio");
            }

            System.out.println(String.format("Marco avanza %.02f horas a %.02f Km/h recorriendo %.02f km", horasMarco, velocidadMarco, horasMarco * velocidadMarco));

            //Lluvia fuerte
            if(probabilidadClimaMama>=0.9){
                velocidadMama *= 0.50; 
                System.out.println("A mamá le ha llovido mucho"); 

            }
            //Lluvia media
            else if (probabilidadClimaMama >=0.6){
                velocidadMama *= 0.75; 
                System.out.println("A mamá le ha llovido poco"); 

            }
            //Buen clima
            else{
                System.out.println("A mamá le ha hecho un buen día"); 
            }

            System.out.println(String.format("Mamá pudo avanzar %.02f horas a %.02f Km/h recorriendo %.02f km", horasMama, velocidadMama, horasMama * velocidadMama));

            distancia += (horasMama * velocidadMama) - (horasMarco * velocidadMarco); //Calculo de distancia
            
            if(distancia >0 && distancia<50){
                if(r.nextDouble()>0.5){
                    distancia -= 25; //Marco avanza 25KM
                    System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                }
            }
            
            if(distancia<=0){ //Si marco encuentra a su madre
                System.out.println("************************************************************");
                System.out.println("Al final del día " +  dia + " Marco encuentra a su madre!!!");
                System.out.println("************************************************************");
                break;
            }
            System.out.println(String.format("Al final del día %d la distancia entre Marco y su Madre es de %.02f km", dia, distancia));
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            dia++;
        }

    }
}