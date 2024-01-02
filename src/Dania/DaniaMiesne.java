package Dania;

public class DaniaMiesne extends Danie{

    private String meatType;

    public DaniaMiesne(String nazwa, double cena, String komponenty, String meatType) {
        super(nazwa, cena, komponenty);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void giveDish() {

    }

    @Override
    public String toString() {
        return "DaniaMiesne{" +
                "nazwa='" + getNazwa() + '\'' +
                ", cena=" + getCena() +
                ", komponenty='" + getKomponenty() + '\'' +
                "meatType='" + meatType + '\'' +
                '}';
    }
}
