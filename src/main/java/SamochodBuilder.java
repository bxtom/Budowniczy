public abstract class SamochodBuilder {
    protected Samochod samochod;

    Samochod getSamochod() {
        return samochod;
    }

    void createNewSamochod() {
        new Samochod();
    }


    void buildModel() {
    }

    void buildPrzebieg() {
    }

    void buildCzyAutomat() {
    }
}
