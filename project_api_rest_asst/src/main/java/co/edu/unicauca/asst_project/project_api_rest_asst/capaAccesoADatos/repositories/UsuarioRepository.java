package co.edu.unicauca.asst_project.project_api_rest_asst.capaAccesoADatos.repositories;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.asst_project.project_api_rest_asst.capaAccesoADatos.models.UsuarioEntity;
import co.edu.unicauca.asst_project.project_api_rest_asst.capaAccesoADatos.models.factIntroEntity;

@Repository
public class UsuarioRepository {
    private ArrayList<UsuarioEntity> listaUsuarios;

    public UsuarioRepository()
    {
        this.listaUsuarios = new ArrayList<UsuarioEntity>();
        cargarUsuario();
    }

    public List<UsuarioEntity> findAll()
    {
        System.out.println("Invocando la lista de usuarios...");
        return this.listaUsuarios;
    }
    public UsuarioEntity findById(Integer id)
    {
        System.out.println("Invocando la consulta de usuarios por el id"+id);
        UsuarioEntity objUsuario=null;
        for(UsuarioEntity user: listaUsuarios){
            if(user.getId()==id){
                objUsuario=user;
                break;
            }
        }
        return objUsuario;
    }
    public UsuarioEntity save(UsuarioEntity user)
    {
        System.out.println("Invocando agregar usuario...");
        UsuarioEntity objUsuario=null;
            if(this.listaUsuarios.add(user)){
                objUsuario=user;
               
            }
        
        return objUsuario;
    }
    public UsuarioEntity update(Integer id, UsuarioEntity user)
    {
        System.out.println("Invocando actualizar usuario...");
        UsuarioEntity objUsuario=null;
        for(int i=0; i<this.listaUsuarios.size();i++){
            if(this.listaUsuarios.get(i).getId()==id){
                this.listaUsuarios.set(i, user);
                objUsuario=user;
                break;
            }
        }
        
        return objUsuario;
    }
    public boolean delete(Integer id)
    {
        System.out.println("Invocando eliminar usuario...");
        boolean flag=false;
        for(int i=0; i<this.listaUsuarios.size();i++){
            if(this.listaUsuarios.get(i).getId()==id){
                this.listaUsuarios.remove(i);
                flag=true;
                break;
            }
        }

        return flag;
    }
    public void cargarUsuario()
    {
    

        ArrayList<factIntroEntity> listPreguntas = new ArrayList<factIntroEntity>();
        factIntroEntity objfact1 = new factIntroEntity(1, "El ruido en el ligar donde trabaja es molesto","Siempre");
        factIntroEntity objfact2 = new factIntroEntity(2, "Es facil transportarme entre mi casa y el trabajo","Casi siempre");
        listPreguntas.add(objfact1);
        listPreguntas.add(objfact2);
        //creo segunda lista de preguntas 
        ArrayList<factIntroEntity> listPreguntas2 = new ArrayList<factIntroEntity>();
        factIntroEntity objfact3 = new factIntroEntity(13, "El ruido en el ligar donde trabaja es molesto","Algunas veces");
        factIntroEntity objfact4 = new factIntroEntity(14, "Es facil transportarme entre mi casa y el trabajo","Nunca");
        listPreguntas2.add(objfact3);
        listPreguntas2.add(objfact4);

        UsuarioEntity obj1 = new UsuarioEntity(1,"Claudia Urrego",2002,"Ingeniero",listPreguntas);
        UsuarioEntity obj2 = new UsuarioEntity(2,"Wilson Riascos",2001,"Arquitecto", listPreguntas2);
        UsuarioEntity obj3 = new UsuarioEntity(3,"Daniela Riascos",1990, "Profesor de planta",listPreguntas2);
        UsuarioEntity obj4 = new UsuarioEntity(4,"Carlos Pica",1945, "Profesor Catedra",listPreguntas);

        this.listaUsuarios.add(obj1);
        this.listaUsuarios.add(obj2);
        this.listaUsuarios.add(obj3);
        this.listaUsuarios.add(obj4);
    }
}
