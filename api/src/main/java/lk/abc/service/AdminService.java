package lk.abc.service;

import lk.abc.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {

    void save(AdminDTO dto);

    void update(AdminDTO dto);

    void delete(String id);

    ArrayList<AdminDTO> getAllAdmins();

    AdminDTO searchById(String id);

}
