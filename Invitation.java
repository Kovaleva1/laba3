package Things;
import Human.*;
import Enums.Statusofthing;

public class Invitation extends Thing {
    public Invitation() {
        super("Приглашение");
    }
    public void toacept(){
        Mr_Phillips mr_phillips= new Mr_Phillips();
        Relatives relatives = new Relatives();
        if(mr_phillips.toinvite(relatives)){
            Statusofthing statusofthing= Statusofthing.ACCEPT;
            System.out.print(name + " " + statusofthing + ".");
        }
        else {
            System.out.print(name + " не принято");
        }
    }

}