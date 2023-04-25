public class Transportas {
    String marke;
    String modelis;
    int metai;

    public Transportas(String tpMarke, String tpModelis, int tpMetai){
        this.marke= tpMarke;
        this.modelis= tpModelis;
        this.metai= tpMetai;
    }
    public String getMarke(){
        return marke;
    }
    public String getModelis(){
        return modelis;
    }

    public int getMetai() {
        return metai;
    }
}
