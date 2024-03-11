package co.edu.unicauca.asst_project.project_api_rest_asst.capaAccesoADatos.models;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class UsuarioEntity {
    private Integer id;
    private String name;
    private Integer anio_nacimiento;
    private String profesion;
    private ArrayList<factIntroEntity> listCuestionario;
    public UsuarioEntity(){}
}
