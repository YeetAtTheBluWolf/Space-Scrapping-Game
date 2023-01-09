package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;
import java.util.Random;
import net.brasscord.school.project.ship.CrewType;

public class ScavengeEvent extends PassiveEvents implements IPrintOptions {

  private int scrap;
  
  public ScavengeEvent(Scrapper user) {
    super(EventType.scrapping, false, user);
    this.scrap = scrapCalc();
  }

  public String toString() {
    return "You received " + scrap + " 5 pieces of scrap.";
  }

  public int scrapCalc() {
    Random random = new Random();
    if(user.getShip().getCrew().getCrewType() == CrewType.Cleanup_Crew)
      return random.nextInt() * 2;
    return random.nextInt();
  }

  @Override
  public void outcome() {
    user.getShip().addScrap(scrap);
  }

  @Override
  public void action(String userInput) {
    if(userInput.equals(options()[0]))
      outcome();
  }
  
}