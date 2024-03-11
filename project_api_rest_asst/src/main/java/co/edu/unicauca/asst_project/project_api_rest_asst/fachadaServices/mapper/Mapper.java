package co.edu.unicauca.asst_project.project_api_rest_asst.fachadaServices.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.*;

@Configuration
public class Mapper {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
