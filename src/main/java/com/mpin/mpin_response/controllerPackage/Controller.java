package com.mpin.mpin_response.controllerPackage;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpin.mpin_response.entities.TeamInfoDTO;
import com.mpin.mpin_response.servicePackage.ServiceImpl;
import com.mpin.mpin_response.servicePackage.ServiceInterface;

@RestController
@RequestMapping("/api/v1/mpin/client/config/")

public class Controller {
    private ServiceImpl team;
    private ServiceInterface service;
    Controller(ServiceInterface service, ServiceImpl team) {
        this.team = team;}
    @GetMapping("/getData")
    public ResponseEntity<Object> dataOutput() {
        ResponseEntity<Object> response= team.getData();
        team.loggerFunc(response);
        return response;
    }
    @PostMapping("/addTeam")
    public ResponseEntity<Object> insertTeam(@RequestBody TeamInfoDTO teaminfodto) {
        ResponseEntity<Object> response = team.insertData(teaminfodto);
        team.loggerFunc(response);  
        return response;
    }
    @PostMapping("/updateTeam")
    public ResponseEntity<Object> updateTeam(@RequestBody TeamInfoDTO teaminfodto){
        ResponseEntity<Object> response = team.updateData(teaminfodto);  
        team.loggerFunc(response);
        return response;
    }
    @PostMapping("/removeTeam")
    public ResponseEntity<Object> deleteTeam(@RequestBody TeamInfoDTO teaminfodto){
        ResponseEntity<Object> response = team.deleteData(teaminfodto);  
        team.loggerFunc(response);
        return response;
    }
}
