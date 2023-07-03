package Behavioral_Patterns.Mediator;
import java.util.ArrayList;
public class ConcreteMediator extends Mediator{
  ArrayList<Colleague> colleagues = new ArrayList<>();
  @Override
  void register(Colleague colleague) {
   if(!colleagues.contains(colleague)){
     colleagues.add(colleague);
     colleague.setMediator(this);
   }
  }
  @Override
  void resend(Colleague colleague) {
    for (Colleague colleagueActual : colleagues){
      if (!colleagueActual.equals(colleague)){
        colleagueActual.receive();
      }
    }
  }
}
