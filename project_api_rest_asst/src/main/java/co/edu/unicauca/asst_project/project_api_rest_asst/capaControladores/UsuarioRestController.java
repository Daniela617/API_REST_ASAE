package co.edu.unicauca.asst_project.project_api_rest_asst.capaControladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.DTO.UsuarioDTO;
import co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.services.IUsuariosServices;



@RestController
@RequestMapping("/api")

public class UsuarioRestController {

    @Autowired
    private IUsuariosServices userService;

    @GetMapping("/usuarios")
    public List<UsuarioDTO> index()
    {
        return userService.findAll();
    }
    
    @GetMapping("/usuarios/{id}")
    public UsuarioDTO show(@PathVariable Integer id){
        UsuarioDTO objUser = null;
        objUser = userService.findById(id);
        return objUser;
    }
   
	@PostMapping("/usuarios")
	public UsuarioDTO create(@RequestBody UsuarioDTO user) {
		UsuarioDTO objUser = null;
		objUser = userService.save(user);
		return objUser;
	}

	@PutMapping("/usuarios/{id}")
	public UsuarioDTO update(@RequestBody UsuarioDTO user, @PathVariable Integer id) {
		UsuarioDTO objUser = null;
		UsuarioDTO userActual = userService.findById(id);
		if (userActual != null) {
			objUser = userService.update(id, user);
		}
		return objUser;
	}
    
	@DeleteMapping("/usuarios")
	public Boolean delete(@RequestParam Integer id) {
		Boolean bandera = false;
		UsuarioDTO userActual = userService.findById(id);
		if (userActual != null) {
			bandera = userService.delete(id);
		}
		return bandera;

	}

	
}
