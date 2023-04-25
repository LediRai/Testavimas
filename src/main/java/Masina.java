public class Masina extends Transportas {
    int dureliuSkaicius;

    public Masina(String tpMarke, String tpModelis, int tpMetai, int tpDuruSkaicius) {
        super(tpMarke, tpModelis, tpMetai);
        this.dureliuSkaicius = tpDuruSkaicius;
    }

    public int getDureliuSkaicius() {
        return dureliuSkaicius;
    }

}
