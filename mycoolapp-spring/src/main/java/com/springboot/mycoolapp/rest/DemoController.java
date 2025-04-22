package com.springboot.mycoolapp.rest;
import com.springboot.mycoolapp.common.Coach;
import com.springboot.mycoolapp.common.CricketCoach;
import com.springboot.mycoolapp.common.HockyCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private HockyCoach hockeyCoach;
    private CricketCoach cricketCoach;

//    Constructor injection
//    @Autowired
//    public  DemoController(HockyCoach HCoach, CricketCoach CCoach) {
//        hockeyCoach = HCoach;
//        cricketCoach = CCoach;
//    }

//  Setter injection
    @Autowired
    public void setCoach(HockyCoach HCoach, CricketCoach CCoach){
        hockeyCoach = HCoach;
        cricketCoach = CCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return "Hockey: " + hockeyCoach.getDailyworkout() + " Cricket: " + cricketCoach.getDailyworkout();
    }



}
