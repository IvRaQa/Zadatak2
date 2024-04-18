public class RadnikPoSatu extends Radnik {

    private double cenaPoSatu= 350;
    private double brojSati;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double brojSati) {
        super(ime, prezime, jmbg, ziroRacun);
        this.brojSati=brojSati;
    }

    @Override
    public double isplatiPlatu() {
        plata = cenaPoSatu * brojSati;
        return plata;
    }

    @Override
    public String toString() {
        return "RadnikPoSatu{" +
                "cenaPoSatu=" + cenaPoSatu +
                ", brojSati=" + brojSati +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                "} ";
    }
}
