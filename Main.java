import Human.*;
import Human.Elizabeth;
import Things.*;
import Enums.*;

public class Main {

    public static void main(String[] args) {

        Elizabeth elizabeth =new Elizabeth();
        Both both = new Both();
        Action action = new Action();
        Meeting meeting = new Meeting();
        elizabeth.amazed(action,both, meeting );
        One one = new One();
        one.turned_pale();
        Second second = new Second();
        second.blush();
        Mr_Wickham mr_wickham=new Mr_Wickham();
        Mr_Darsi darsi = new Mr_Darsi();
        Hat hat= new Hat();
        mr_wickham.touch(hat);
        darsi.ask(mr_wickham);
        What what=new What();
        what.tocanmean(Statusofmeaning.CAN_MEANING);
        Stroryteller storyteller = new Stroryteller();
        storyteller.tocomeup();
        storyteller.toholdon();
        System.out.println( );
        Mr_Bingli bingli=new Mr_Bingli();
        bingli.ride(darsi);
        System.out.println();
        Mr_Denny denny = new Mr_Denny();
        Lidiia lidiia=new Lidiia();
        Ms_Phillips phillips = new Ms_Phillips();
        lidiia.invite();
        phillips.supported(lidiia);
        System.out.println( );
        phillips.haapytosee(elizabeth, lidiia);
        Coming coming = new Coming();
        coming.disered();
        phillips.surprised(coming);
        Jane jane = new Jane();
        elizabeth.toreturn(jane);
       phillips.todonotknow();
       Mr_Collins collins = new Mr_Collins();
       collins.toapologize(phillips);
       phillips.respect(collins);
       phillips.tocannotsay(mr_wickham);
       Kitty kitty = new Kitty();
       phillips.towatch();
       kitty.towatch(lidiia, mr_wickham);
       Young_man young_man = new Young_man();
       Window window = new Window();
       young_man.towas(window,Statusofstreet.EMPTY);
       Mr_Phillips mr_phillips = new Mr_Phillips();
       Someone someone = new Someone();
       someone.tobeinvite(mr_phillips);
       phillips.toask(mr_phillips, mr_wickham);
       Invitation invitation = new Invitation();
       invitation.toacept();
       They they = new They();
       they.tobehappy();
       collins.toapologize(phillips);
    }
}