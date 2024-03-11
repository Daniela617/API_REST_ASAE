package co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.DTO;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

import lombok.AllArgsConstructor;

@Getter @Setter @AllArgsConstructor
public class UsuarioDTO {
    private Integer id;
    private String name;
    private Integer anio_nacimiento;
    private String profesion;
    private ArrayList<factIntroDTO> listCuestionario;
    

    
    public UsuarioDTO(){}
}
