public class Samochod implements Cloneable {
    private String marka = "";
    private int pojemnosc = 0;
    private int przebieg = 0;
    private boolean czyAutomat = false;

    public Samochod() {
    }

    private Samochod(Builder builder) {
        setMarka(builder.marka);
        setPojemnosc(builder.pojemnosc);
        setPrzebieg(builder.przebieg);
        setCzyAutomat(builder.czyAutomat);
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    void setMarka(String marka) {
        this.marka = marka;
    }

    void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    void setCzyAutomat(boolean czyAutomat) {
        this.czyAutomat = czyAutomat;
    }

    public static final class Builder {
        private String marka;
        private int pojemnosc;
        private int przebieg;
        private boolean czyAutomat;

        private Builder() {
        }

        public Builder withMarka(String val) {
            marka = val;
            return this;
        }

        public Builder withPojemnosc(int val) {
            pojemnosc = val;
            return this;
        }

        public Builder withPrzebieg(int val) {
            przebieg = val;
            return this;
        }

        public Builder withCzyAutomat(boolean val) {
            czyAutomat = val;
            return this;
        }

        public Samochod build() {
            return new Samochod(this);
        }
    }

    public Object clone() {
        try {
            Samochod copy = (Samochod) super.clone();

            //In an actual implementation of this pattern you might now change references to
            //the expensive to produce parts from the copies that are held inside the prototype.

            return copy;

        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", pojemnosc=" + pojemnosc +
                ", przebieg=" + przebieg +
                ", czyAutomat=" + czyAutomat +
                '}';
    }
}
