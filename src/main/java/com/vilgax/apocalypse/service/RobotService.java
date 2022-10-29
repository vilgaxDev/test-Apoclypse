package com.vilgax.apocalypse.service;

import com.vilgax.apocalypse.model.Robot;
import com.vilgax.apocalypse.repository.RobotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RobotService {
    @Autowired
    RobotRepository robotRepository;

    @Value("${robot.api}")
    private String robotApi;

    public List<Robot> listAllRobots() {
        return  robotRepository.findAll();

    }

    public List<Robot> listAllLandRobots() {
        return  robotRepository.findByCategory("Land");

    }

    public List<Robot> listAllFlyingRobots() {

        return  robotRepository.findByCategory("Flying");

    }




    public void apiFetch(){
        try {

            robotRepository.deleteAll();
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<List<Robot>> rateResponse = restTemplate.exchange(robotApi, HttpMethod.GET,
                    null, new ParameterizedTypeReference<List<Robot>>() {
                    });
            List<Robot> robots = rateResponse.getBody();
             robotRepository.saveAll(robots);
        }catch(Exception e){
            System.out.println("Please Connect to the internet to load robots "+ e);
        }
    }
}
