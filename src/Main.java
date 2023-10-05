import Worker.Dipendente;
import Worker.Livelli;
import Worker.Zone;

public class Main {
    public static void main(String[] args) {


        Dipendente franco = new Dipendente(100 , Zone.PRODUZIONE);
        Dipendente gianni = new Dipendente(101 , Zone.PRODUZIONE);
        Dipendente stanley = new Dipendente(200 , Zone.AMMINISTRAZIONE, Livelli.IMPIEGATO, 1200 , 0.0 );
        Dipendente coso = new Dipendente(200 , Zone.VENDITE , Livelli.DIRIGENTE , 2000 , 0.0 );


        franco.stampaDatiDipendente();
        System.out.println("-----------------------------------------");
        franco.promotion();
        franco.stampaDatiDipendente();
        System.out.println("-----------------------------------------");
        stanley.stampaDatiDipendente();
        System.out.println("-----------------------------------------");
        stanley.promotion();
        stanley.stampaDatiDipendente();

        stanley.calcolaPaga(40);


        franco.alloca(Zone.AMMINISTRAZIONE);




    }
}