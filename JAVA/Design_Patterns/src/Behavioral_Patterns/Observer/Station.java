package Behavioral_Patterns.Observer;

import java.util.ArrayList;

public class Station {

  private final ArrayList<Receptor> listReceptor = new ArrayList<>();

  public void addReceptor(Receptor receptor){
    this.listReceptor.add(receptor);
  }

  public void transmitter(){
    for(Receptor receptor : listReceptor){
      receptor.receive();
    }
  }

}
