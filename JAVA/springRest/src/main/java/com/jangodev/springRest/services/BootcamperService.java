package com.jangodev.springRest.services;

import com.jangodev.springRest.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
  private final List<Bootcamper> bootcampers = new ArrayList<>();
  public List<Bootcamper> getListBootcampers() { return bootcampers; }
  public void addBootacamper(Bootcamper bootcamper) { bootcampers.add(bootcamper); }

  public Bootcamper getBootcamper(String name) {
    for (Bootcamper bootcamper : bootcampers) {
      if (bootcamper.getName().equalsIgnoreCase(name)){
        return bootcamper;
      }
    }
    return null;
  }
}
