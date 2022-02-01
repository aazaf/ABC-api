package lk.abc.service;

import lk.abc.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {

    void save(UserDTO dto);

    void update(UserDTO dto);

    void delete(String id);

    ArrayList<UserDTO> getAllUsers();

    UserDTO searchById(String id);

}
