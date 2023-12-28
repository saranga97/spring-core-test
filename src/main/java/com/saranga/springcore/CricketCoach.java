package com.saranga.springcore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 30 minutes";
    }
}
