package co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.TypeToken;

import co.edu.unicauca.asst_project.project_api_rest_asst.capaAccesoADatos.models.UsuarioEntity;
import co.edu.unicauca.asst_project.project_api_rest_asst.capaAccesoADatos.repositories.UsuarioRepository;
import co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.DTO.UsuarioDTO;

@Service
public class UsuarioServicesImpl implements IUsuariosServices{
    
    @Autowired
    private UsuarioRepository servicioAccesoBaseDatos;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UsuarioDTO> findAll() {
        List<UsuarioEntity> usersEntity = this.servicioAccesoBaseDatos.findAll();
        List<UsuarioDTO> usersDTO = this.modelMapper.map(usersEntity, new TypeToken<List<UsuarioDTO>>(){}.getType());
        return usersDTO;
        
    }

    @Override
    public UsuarioDTO findById(Integer id) {
        UsuarioEntity objUserEntity = this.servicioAccesoBaseDatos.findById(id);
		UsuarioDTO userDTO = this.modelMapper.map(objUserEntity, UsuarioDTO.class);
		return userDTO;
	
    }

    @Override
    public UsuarioDTO save(UsuarioDTO user) {
        UsuarioEntity userEntity = this.modelMapper.map(user, UsuarioEntity.class);
		UsuarioEntity objUserEntity = this.servicioAccesoBaseDatos.save(userEntity);
		UsuarioDTO userDTO = this.modelMapper.map(objUserEntity, UsuarioDTO.class);
		return userDTO;
    }

    @Override
    public UsuarioDTO update(Integer id, UsuarioDTO user) {
        UsuarioEntity userEntity = this.modelMapper.map(user, UsuarioEntity.class);
		UsuarioEntity userEntityActualizado = this.servicioAccesoBaseDatos.update(id, userEntity);
		UsuarioDTO userDTO = this.modelMapper.map(userEntityActualizado, UsuarioDTO.class);
		return userDTO;
    }

    @Override
    public boolean delete(Integer id) {
        return this.servicioAccesoBaseDatos.delete(id);
    }

    

    

}
