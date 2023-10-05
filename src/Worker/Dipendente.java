package Worker;

import java.util.Objects;
import java.util.Random;

public class Dipendente {

    double stipendioBase = 1000;
    int matricola;
    double stipendio;
    String livello;
    String dipartimento;
    double importoOrarioStraordinario;




    //costruttore


    public Dipendente( int matricola , String dipartimento){
        this.dipartimento = dipartimento;
        this.livello = "operaio";
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30.0;
        this.matricola = matricola;
    }
    public Dipendente( int matricola , String dipartimento , String livello , int stipendio , double importoOrarioStraordinario){
        this.dipartimento = dipartimento;
        this.livello = livello;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.matricola = matricola;
    }



    public void calcolaPaga(){
        System.out.println("questo è lo stipendio base : " + this.stipendio);
    }

    public void calcolaPaga(int oreStraordinarie){
        System.out.println("hai lavorato " + oreStraordinarie + " ore, questo è lo stipendio a fine mese: "+ (this.stipendio + (oreStraordinarie * 0.6)));
    }



    public void stampaDatiDipendente(){
        System.out.println( this.livello + " n.matricola : " + this.matricola + "stipendio : " + this.stipendio + " allocato in : " + this.dipartimento);
    }

    //setters
    public void alloca(String zona){
        this.dipartimento = zona;
    }
    public void faiStraordinari(double howMuch){
        this.importoOrarioStraordinario += howMuch;
    }
    @Override
    public String toString() {
        return "Operaio{" +
                "stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello='" + livello + '\'' +
                ", matricola=" + matricola +
                ", dipartimento='" + dipartimento + '\'' +
                '}';
    }

    public void promotion(){
        if(Objects.equals(this.livello, "operaio")){
            this.livello = "IMPIEGATO";
            this.stipendioBase *=  (1000 * 1.2);
        }else if(Objects.equals(this.livello, "IMPIEGATO")){
            this.livello = "QUADRO";
            this.stipendioBase *=  (1000 * 1.5);
        }else if(Objects.equals(this.livello, "QUADRO")){
            this.livello = "DIRIGENTE";
            this.stipendioBase = (1000 *  2);
        }else  {
            System.out.println("non è possibile promuovere");
        }
    }



}
