package co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.services;

import java.util.List;

import co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.DTO.UsuarioDTO;

public interface IUsuariosServices {
    
    public List<UsuarioDTO> findAll();
    
    public UsuarioDTO findById(Integer id);
    
    public UsuarioDTO save(UsuarioDTO user);
    
    public UsuarioDTO update(Integer id, UsuarioDTO user);
    
    public boolean delete(Integer id);

    
} 
