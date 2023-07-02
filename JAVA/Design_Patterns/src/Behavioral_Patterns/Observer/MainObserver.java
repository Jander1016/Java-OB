package Behavioral_Patterns.Observer;

public class MainObserver {
  public static void main(String[] args) {
    Station station = new Station();

    ReceptorRadio radio = new ReceptorRadio();
    ReceptorSatellite satellite = new ReceptorSatellite();
    ReceptorTV tv = new ReceptorTV();

    station.addReceptor(radio);
    station.addReceptor(satellite);
    station.addReceptor(tv);

    station.transmitter();

  }
}
