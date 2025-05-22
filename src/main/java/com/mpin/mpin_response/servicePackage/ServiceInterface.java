package com.mpin.mpin_response.servicePackage;

import org.springframework.http.ResponseEntity;

import com.mpin.mpin_response.entities.TeamInfoDTO;

public interface ServiceInterface {
    ResponseEntity<Object> getData();
    ResponseEntity<Object> insertData(TeamInfoDTO teaminfodto);
    ResponseEntity<Object> updateData(TeamInfoDTO teaminfodto);
    ResponseEntity<Object> deleteData(TeamInfoDTO teaminfodto);
    public void loggerFunc(ResponseEntity<Object> response);
}
