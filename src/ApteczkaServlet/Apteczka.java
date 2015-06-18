package ApteczkaServlet;

/**
 * Created by Pawel on 2015-06-11.
 */
public class Apteczka {
    int id_leku;
    String nazwa_handlowa_leku;
    String nazwa_miedzynarodowa;
    String nazwa_substancji_czynnej;
    String wskazania;
    String przeciwwskazania;
    String rodzaj;

    public void setId_leku(int id_leku){

        this.id_leku=id_leku;
    }
    public int getId_leku(){

        return id_leku;
    }
    public void setNazwa_handlowa_leku(String nazwa_handlowa_leku){

        this.nazwa_handlowa_leku=nazwa_handlowa_leku;
    }
    public String getNazwa_handlowa_leku(){

        return nazwa_handlowa_leku;
    }
    public void setNazwa_miedzynarodowa(String nazwa_miedzynarodowa){

        this.nazwa_miedzynarodowa=nazwa_miedzynarodowa;
    }
    public  String getNazwa_miedzynarodowa(){

        return nazwa_miedzynarodowa;
    }
    public void setNazwa_substancji_czynnej(String nazwa_substancji_czynnej){

        this.nazwa_substancji_czynnej=nazwa_substancji_czynnej;
    }
    public String getNazwa_substancji_czynnej(){

        return nazwa_substancji_czynnej;
    }
    public void setWskazania(String wskazania){

        this.wskazania=wskazania;
    }
    public String getWskazania(){

        return wskazania;
    }
    public void setPrzeciwwskazania(String przeciwwskazania){

        this.przeciwwskazania=przeciwwskazania;
    }
    public String getPrzeciwwskazania(){

        return przeciwwskazania;
    }
    public void setRodzaj(String rodzaj){

        this.rodzaj=rodzaj;
    }
    public String getRodzaj(){

        return rodzaj;
    }
    @Override
    public String toString(){
        return "Apteczka [id_leku="+id_leku+
                ", nazwa_handlowa_leku="+nazwa_handlowa_leku+
                ", nazwa_miedzynarodowa="+nazwa_miedzynarodowa+
                ", nazwa_substancji_czynnej="+nazwa_substancji_czynnej+
                ", wskazania="+wskazania+
                ", przeciwwskazania="+przeciwwskazania+
                ", rodzaj="+rodzaj+"]";
    }

}
