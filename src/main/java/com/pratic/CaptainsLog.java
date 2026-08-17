import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int classePlanet = PLANET_CLASSES.length;
        int numberRandom = random.nextInt(classePlanet);
        return PLANET_CLASSES[numberRandom];
    }

    //antes eu tinha colocado como parametro do nextInt os valores 1000, 9999 porem isso
    //não iclui o 9999, a lógica usada é que de 1000 ate 9999 inclusos temos 9000 numeros, entao
    //coloquei como parametro 9000 e 1000 na frente é o ponto de partida.
    String randomShipRegistryNumber() {
        int numberShip = 1000 + random.nextInt(9000);
        String wordPlate = "NCC-";
        return wordPlate + numberShip;
    }

    //Mesma lógica usada acima
    double randomStardate() {
        double date = 41000 + random.nextDouble(1000);
        return date;
    }
}