package com.saranga.springcore;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Run hard 5k";
    }
}
