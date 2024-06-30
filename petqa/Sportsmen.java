package petqa;

public class Sportsmen {

    private String Anun;
    private String Azganun;
    private int Tariq = 18;
    private String Qaxaq;
    private float Andznakan_qash;

    public int getTariq() {
      return Tariq;
    }

    public String getAzganun() {
        return Azganun;
    }

    public void setAzganun(String azganun) {
        Azganun = azganun;
    }

    public String getQaxaq() {
        return Qaxaq;
    }

    public void setQaxaq(String qaxaq) {
        Qaxaq = qaxaq;
    }

    public String getAnun() {
        return Anun;
    }

    public void setAnun(String anun) {
        Anun = anun;
    }

    public void setTariq(int tariq) {
        if (tariq > 0){
        Tariq = tariq;}
    }

    public float getAndznakan_qash() {
        return Andznakan_qash;
    }

    public void setAndznakan_qash(float andznakan_qash) {
        if (andznakan_qash > 0.0){
        Andznakan_qash = andznakan_qash;}
    }

    public void Tvyalner (){
        System.out.println(Anun + "  " + Azganun + " " + Tariq + " " + Qaxaq + " " + Andznakan_qash);














    }


    }


