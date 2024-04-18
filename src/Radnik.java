public abstract class Radnik {

    String ime;
    String prezime;
    String jmbg;
    String ziroRacun;
    double plata;

    public Radnik(){}
    public Radnik(String ime, String prezime, String jmbg, String ziroRacun) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
    }
    public double isplatiPlatu(){
    return plata;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                '}';
    }
}
