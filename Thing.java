package Things;


import Enums.Place;
import Interface.Signifiable;
import Enums.Statusofmeaning;

public  abstract class Thing implements Signifiable {
  public Statusofmeaning stat = Statusofmeaning.MEANING;
  public   String name;
  public Place place;
  public Thing(){}
    public  Thing(String name){
      this.name=name;

    }
    public Thing(String name, Place place){
      this.name=name;
      this.place=place;
    }

    public String getName() {
        return name;
    }
  public Place place(){
    return place;
  }


    public void setName(String name){
        this.name = name;
    }
  public  void setPlace(Place place){
    this.place=place;
  }

}







