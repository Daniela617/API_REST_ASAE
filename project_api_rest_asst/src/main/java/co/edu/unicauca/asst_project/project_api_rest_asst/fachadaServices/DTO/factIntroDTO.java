package co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.DTO;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter @Setter @AllArgsConstructor
public class factIntroDTO {
    private Integer id;
    private String descripcion_pregunta;
    private String respuesta_pregunta;
    public factIntroDTO(){}
    
}
