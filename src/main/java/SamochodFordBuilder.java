public class SamochodFordBuilder extends SamochodBuilder {
    @Override
    public Samochod getSamochod() {
        return samochod;
    }

    @Override
    public void createNewSamochod() {
        samochod = new Samochod();
    }

    @Override
    public void buildModel() {
        samochod.setMarka("Ford");
        samochod.setPojemnosc(2500);
    }

    @Override
    public void buildPrzebieg() {
        samochod.setPrzebieg(900000);
    }

    @Override
    public void buildCzyAutomat() {
        samochod.setCzyAutomat(true);
    }
}
