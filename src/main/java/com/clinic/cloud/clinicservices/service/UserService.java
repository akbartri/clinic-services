package com.clinic.cloud.clinicservices.service;


import com.clinic.cloud.clinicservices.model.User;
import com.clinic.cloud.clinicservices.model.dto.RequestDTO;
import com.clinic.cloud.clinicservices.model.dto.ResponseDTO;

import java.util.List;

public interface UserService {
    public ResponseDTO save(RequestDTO requestDTO);
    public List<User> findAll();
    public ResponseDTO findById(int id);
    public ResponseDTO deleteByid(int id);
}
