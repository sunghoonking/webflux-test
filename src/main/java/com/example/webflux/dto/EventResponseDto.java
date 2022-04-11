package com.example.webflux.dto;

import java.time.LocalDateTime;

public class EventResponseDto {
    private final Long id;
    private final String title;
    private final String description;
    private final String color;
    private final LocalDateTime start;
    private final LocalDateTime end;
    private boolean allDay;
    private boolean deleteStatus;


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public boolean isAllDay() {
        return allDay;
    }

    public boolean getDeleteStatus() {
        return deleteStatus;
    }

    public EventResponseDto(Long id, String title, String description, String color, LocalDateTime start, LocalDateTime end, boolean allDay, boolean deleteStatus) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.color = color;
        this.start = start;
        this.end = end;
        this.allDay = allDay;
        this.deleteStatus = deleteStatus;
    }


    @Override
    public String toString() {
        return "EventResponseDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", allDay=" + allDay +
                '}';
    }
}