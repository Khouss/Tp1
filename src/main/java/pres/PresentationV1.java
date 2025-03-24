package pres;
import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args){
        //DaoImpl d = new DaoImpl();
       DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d); //via constructeur
        //metier.setDao(d); //injection via le setter
        System.out.println("Res "+metier.calcul());
    }
}
