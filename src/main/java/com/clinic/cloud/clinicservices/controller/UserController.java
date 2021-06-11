package com.clinic.cloud.clinicservices.controller;

import com.clinic.cloud.clinicservices.model.dto.ResponseDTO;
import com.clinic.cloud.clinicservices.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/user")
public class UserController {
    private UserService userService;
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<ResponseDTO> findAllUser() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus("1");
        responseDTO.setMessage("success");
        responseDTO.setContents(userService.findAll());

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
