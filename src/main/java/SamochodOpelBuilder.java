public class SamochodOpelBuilder extends SamochodBuilder {
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
        samochod.setMarka("Opel");
        samochod.setPojemnosc(1500);
    }

    @Override
    public void buildPrzebieg() {
        samochod.setPrzebieg(120000);
    }

    @Override
    public void buildCzyAutomat() {
        samochod.setCzyAutomat(false);
    }
}
