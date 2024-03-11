package co.edu.unicauca.asst_project.project_api_rest_asst.capaAccesoADatos.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class factIntroEntity {

    private Integer id;
    private String descripcion_pregunta;
    private String respuesta_pregunta;

    
    public factIntroEntity(){}
}
