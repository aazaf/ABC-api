package lk.abc.service;

import lk.abc.dto.CategoryDTO;

import java.util.ArrayList;

public interface CategoryService {

    void save(CategoryDTO dto);

    void update(CategoryDTO dto);

    void delete(String id);

    ArrayList<CategoryDTO> getAllCategories();

    CategoryDTO searchById(String id);

}
