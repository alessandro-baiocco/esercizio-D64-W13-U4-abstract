import Worker.Dipendente;

public class Main {
    public static void main(String[] args) {


        Dipendente franco = new Dipendente(100 , "produzione");
        Dipendente gianni = new Dipendente(101 , "produzione");
        Dipendente stanley = new Dipendente(200 , "AMMINISTRAZIONE" , "IMPIEGATO" , 1200 , 0.0 );
        Dipendente coso = new Dipendente(200 , "VENDITE" , "DIRIGENTE" , 2000 , 0.0 );


        franco.stampaDatiDipendente();
        System.out.println("-----------------------------------------");
        franco.promotion();
        franco.stampaDatiDipendente();
        System.out.println("-----------------------------------------");
        stanley.stampaDatiDipendente();
        System.out.println("-----------------------------------------");
        stanley.promotion();
        stanley.stampaDatiDipendente();


    }
}