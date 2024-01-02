package Dania;

public class DaniaVegetarianskie extends Danie{
    private String meatType;

    public DaniaVegetarianskie(String nazwa, double cena, String komponenty, String meatType) {
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
    public void display() {
        System.out.println("DaniaVegetarianskie{" +
                "nazwa='" + getNazwa() + '\'' +
                ", cena=" + getCena() +
                ", komponenty='" + getKomponenty() + '\'' +
                "meatType='" + meatType + '\'' +
                '}');
    }
}
