package com.vilgax.apocalypse.controller;

import com.vilgax.apocalypse.model.Robot;
import com.vilgax.apocalypse.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/robot")
public class RobotController {
    @Autowired
    RobotService robotService;

    @GetMapping("/land/list")
    public List<Robot> getAllLandRobots(){
        return robotService.listAllLandRobots();
    }
    @GetMapping("/flying/list")
    public List<Robot> getAllAirRobots(){
        return robotService.listAllFlyingRobots();
    }
    @GetMapping("/list")
    public List<Robot> getAllRobots(){
        return robotService.listAllRobots();
    }

}
