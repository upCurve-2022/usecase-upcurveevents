package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="mentors")
public class Mentor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="Name",nullable = false)
    private String Name;
    @Column(name="event_Name")
    private String eventName;
    @Column(name="Date")
    private String Date;
    @Column(name="duration")
    private String duration;
    @Column(name="email")
    private String email;

    public Mentor(){

    }

    public Mentor(String Name,String eventName,String Date,String duration,String email) {
        super();
        this.Name=Name;
        this.eventName=eventName;
        this.Date=Date;
        this.duration=duration;
        this.email=email;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
