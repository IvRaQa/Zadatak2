public class RadnikFiksno extends Radnik {
    double brojSatiMesecno=160;

    double cenaPoSatu=250;

    public RadnikFiksno(String ime, String prezime, String jmbg, String ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);

    }

    @Override
    public double isplatiPlatu() {
        plata = brojSatiMesecno*cenaPoSatu;
        return plata;
    }

    @Override
    public String toString() {
        return "RadnikFiksno{" +
                "brojSatiMesecno=" + brojSatiMesecno +
                ", cenaPoSatu=" + cenaPoSatu +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                "} ";
    }
}
