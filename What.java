package Things;


import Enums.Statusofmeaning;

public class What extends Thing  {
    public What(){
        super("Что");
    }

    @Override
    public void tocanmean(Statusofmeaning stat) {
        stat =Statusofmeaning.CAN_MEANING;
        System.out.print(name + " это " + stat + "?");
    }

}
