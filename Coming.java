package Things;

import Human.Elizabeth;
import Human.*;
import Enums.Adverb;
import Enums.Statusofthing;

public class Coming extends Thing{
    public Coming(){
        super("приход");

    }
    Jane jane = new Jane();
    Elizabeth elizabeth =new Elizabeth();
    public void disered(){

    if (jane.absent(elizabeth)) {
        Statusofthing statusofthing=Statusofthing.TO_BE_DISERED;
        Adverb adverb = Adverb.SO;
        System.out.print( adverb + " " + name + " "+ statusofthing +".");

    }
    else {
        System.out.print(name + " не вызвал радости");

        }
        }

    }


