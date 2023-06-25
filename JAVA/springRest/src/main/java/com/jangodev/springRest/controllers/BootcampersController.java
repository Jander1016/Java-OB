package com.jangodev.springRest.controllers;

import com.jangodev.springRest.models.Bootcamper;
import com.jangodev.springRest.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
  private final BootcamperService bootcamperService;
  public BootcampersController(BootcamperService bootcamperService) {
    this.bootcamperService = bootcamperService;

    this.bootcamperService.addBootacamper(new Bootcamper("Juan", Math.random()));
    this.bootcamperService.addBootacamper(new Bootcamper("Jorge", Math.random()));
    this.bootcamperService.addBootacamper(new Bootcamper("Carlos", Math.random()));
  }

  @GET
  @Path("/bootcampers")
  @Produces("application/json")
  public List<Bootcamper> listAll(){
    return bootcamperService.getListBootcampers();
  }

  @POST
  @Path("/bootcampers")
  @Produces("application/json")
  @Consumes("application/json")
  public Response setBootcampers(Bootcamper bootcamper){
    bootcamperService.addBootacamper(bootcamper);
    return Response.created(URI.create("/bootcampers" + bootcamper.getName())).build();
  }

  @GET
  @Path("/bootcampers/{name}")
  @Produces("application/json")
  public Bootcamper getBootcamper(@PathParam("name") String name) {
    return bootcamperService.getBootcamper(name);
  }

}
