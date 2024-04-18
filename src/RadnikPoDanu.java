public class RadnikPoDanu extends Radnik{
   private double brojDana;
   private double cenaPoSatu=300;
    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun,double brojDana) {
        super(ime, prezime, jmbg, ziroRacun);
        this.brojDana=brojDana;
    }

    @Override
    public double isplatiPlatu() {
        plata = brojDana * 8 * cenaPoSatu;
        return plata;
    }

    @Override
    public String toString() {
        return "RadnikPoDanu{" +
                "brojDana=" + brojDana +
                ", brojDana=" + brojDana +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                "} " ;
    }
}
