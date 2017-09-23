public class Klient {


    public static void main(String[] args) {
        SamochodBuilder opelBuilder = new SamochodOpelBuilder();

        SamochodBuilder fordBuilder = new SamochodFordBuilder();

        fordBuilder.createNewSamochod();
        fordBuilder.buildModel();
        Samochod ford = fordBuilder.getSamochod();

        Samochod samochod = Samochod.newBuilder().withPojemnosc(1200).withMarka("Renault").build();
        Samochod samochod2 = Samochod.newBuilder().withCzyAutomat(true).withMarka("VW").build();
        Samochod samochod3 = Samochod.newBuilder().withMarka("Tesla").build();

        Samochod samochod4 = (Samochod) samochod.clone();

        System.out.println(samochod);
        System.out.println(samochod4);
    }

}
