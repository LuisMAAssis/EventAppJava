package com.luismiguel;

import java.time.LocalDateTime;

public class Event {
    private String eventName;
    private String eventAddress;
    private String category;
    private LocalDateTime time;
    private String description;

    public Event(String eventName, String eventAddress, String category, LocalDateTime time, String description) {
        this.eventName = eventName;
        this.eventAddress = eventAddress;
        this.category = category;
        this.time = time;
        this.description = description;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public String getCategory() {
        return category;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }
}
