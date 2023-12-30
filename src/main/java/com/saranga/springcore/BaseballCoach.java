package com.saranga.springcore;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Batting practice fast bowling for 30 minutes";
    }
}
