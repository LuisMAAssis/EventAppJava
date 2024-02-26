package com.luismiguel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ManagerEvent {

    private List<Event> events;

    public ManagerEvent() {
        events = new ArrayList<>();
    }

    public void registerEvent(Event event) {
        events.add(event);
    }

    public List<Event> consultEvents() {
        return events;
    }
}
