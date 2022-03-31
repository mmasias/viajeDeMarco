public class viajeDeMarco {
    public static void main(String[] args) {

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        double distanciaTotal = 350;
        int dia = 0;

        while (distanciaTotal >= 0) {
            
            dia = dia + 1;
            double cansansioMarco = 0;

            double tiempoMarco = Math.random() * (10 - 8) + 8;
            double velocidadMarco = Math.random() * (15 - 10) + 10;

            //Probabilidad de lluvia - Marco
            double climaMarco = Math.random();
            int climaMarcoStatus = 0;
            String climaMarcoText = "Clima despejado";
            if (climaMarco <= 0.10) {
                climaMarcoStatus = 2;
                climaMarcoText = "Lluvia fuerte";
                cansansioMarco = 0.25;
            } else if (climaMarco > 0.10 && climaMarco <= 0.40) {
                climaMarcoStatus = 1;
                climaMarcoText = "Lluvia ligera";
                cansansioMarco = 0.75;
            }

            //Problemas con el mono
            int monoStatus = 0;
            double monoCansado = Math.random();
            if (monoCansado <= 0.25) {
                if (cansansioMarco != 0) {cansansioMarco = cansansioMarco - 0.10;}
                else {cansansioMarco = cansansioMarco * 0.90;};
                monoStatus = 1;
            }
            double monoEscape = Math.random();
            if (monoEscape <= 0.15) {
                tiempoMarco = tiempoMarco - 2;
                monoStatus = 2;
            }
            if (monoCansado <= 0.25 && monoEscape <= 0.15) {
                tiempoMarco = tiempoMarco - 2;
                monoStatus = 3;
            }

            if (cansansioMarco != 0) {velocidadMarco = velocidadMarco * cansansioMarco;};
            double distanciaMarco = velocidadMarco * tiempoMarco;

            double tiempoMadre = Math.random() * (10 - 8) + 8;
            double velocidadMadre = Math.random() * (9 - 6) + 6;

            //Probabilidad de lluvia - Madre
            double climaMadre = Math.random();
            int climaMadreStatus = 0;
            String climaMadreText = "Clima despejado";
            if (climaMadre <= 0.10) {
                climaMadreStatus = 2;
                climaMadreText = "Lluvia fuerte";
                velocidadMadre = velocidadMadre * 0.50;
            } else if (climaMadre > 0.10 && climaMadre <= 0.40) {
                climaMadreStatus = 1;
                climaMadreText = "Lluvia ligera";
                velocidadMadre = velocidadMadre * 0.75;
            }

            double distanciaMadre = velocidadMadre * tiempoMadre;

            distanciaTotal = distanciaTotal - distanciaMarco + distanciaMadre;

            var sprintText = "";
            double sprintChance = Math.random();
            if (distanciaTotal <= 50 && sprintChance <= 0.50) {
                distanciaTotal = distanciaTotal - 25;
                sprintText = "A Marco le dicen que han visto a su mamá, y rompe a correr!!!";
            }

            System.out.println("DIA [" + dia + "]");
            if (monoStatus == 1) {System.out.println("El mono esta cansado...");}
            else if (monoStatus == 2) {System.out.println("El mono se ha escapado!");}
            else if (monoStatus == 3) {
                System.out.println("El mono esta cansado...");
                System.out.println("El mono se ha escapado!");
            }
            System.out.println("Clima de Marco: " + climaMarcoText);
            System.out.println("Marco ha viajado por " + tiempoMarco + " horas a " + velocidadMarco + " km/h, recorriendo " + distanciaMarco + " km.");
            System.out.println("Clima de la madre: " + climaMadreText);
            System.out.println("La madre ha viajado por " + tiempoMadre + " horas a " + velocidadMadre + " km/h, recorriendo " + distanciaMadre + " km.");
            if (distanciaTotal <= 50 && sprintChance <= 0.50) {System.out.println(sprintText);}
            if (distanciaTotal > 0) {
                System.out.println("La distancia entre Marco y su madre es de " + distanciaTotal + " km.");
            } else {
                System.out.println("Marco ha encontrado a su madre!");
            }
            System.out.println("Cansansio: " + cansansioMarco);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
}