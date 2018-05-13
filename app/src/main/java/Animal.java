import java.io.Serializable;

/**
 * Created by tkl on 13.05.2018.
 */

public class Animal implements Serializable {
    private int _id;
    private String gatunek;
    private String kolor;
    private float wielkosc;
    private String opis;

    public Animal() {}
    public Animal(String gatunek, String kolor, float wielkosc, String opis){
        super();
        this.gatunek=gatunek;
        this.kolor=kolor;
        this.wielkosc=wielkosc;
        this.opis=opis;
    }

    @Override
    public String toString(){
        return "Zwierze: [id=" + _id + ", gatunek=" + gatunek + ", kolor=" + kolor + "wielkosc="+wielkosc+" ]";
    }
    //Metoda zwracająca opis zwierzęcia
    public String getOpis(){return opis;}
    public String getGatunek(){return gatunek;}
    public String getKolor(){return kolor;}
    public float getWielkosc(){return wielkosc;}
    public int get_id(){return _id;}
    public  void  set_id(int _id){this._id=_id;}
}
