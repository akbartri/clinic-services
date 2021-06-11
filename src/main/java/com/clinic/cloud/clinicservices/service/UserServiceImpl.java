package com.clinic.cloud.clinicservices.service;

import com.clinic.cloud.clinicservices.model.User;
import com.clinic.cloud.clinicservices.model.dto.RequestDTO;
import com.clinic.cloud.clinicservices.model.dto.ResponseDTO;
import com.clinic.cloud.clinicservices.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseDTO save(RequestDTO requestDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus("1");
        responseDTO.setMessage("success");

        User saveOrUpdateUser = (User) requestDTO.getContent();
        responseDTO.setContents(userRepository.save(saveOrUpdateUser));

        return responseDTO;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public ResponseDTO findById(int id) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus("1");
        responseDTO.setMessage("success");
        responseDTO.setContents(userRepository.findById(id).get());

        return responseDTO;
    }

    @Override
    public ResponseDTO deleteByid(int id) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus("1");
        responseDTO.setMessage("success");
        User deleteUser = userRepository.findById(id).get();
        userRepository.delete(deleteUser);

        return responseDTO;
    }
}
