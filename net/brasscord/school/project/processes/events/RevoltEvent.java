package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class RevoltEvent extends HostileEvents implements IPrintOptions {
    public RevoltEvent(Scrapper user) {
        super(EventType.emergency, true, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }

    @Override
    public void victory() {

    }

    @Override
    public void failure() {

    }
}