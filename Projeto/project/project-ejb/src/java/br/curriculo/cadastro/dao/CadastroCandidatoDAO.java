
package br.curriculo.cadastro.dao;
import javax.persistence.EntityManager;
import br.curriculo.cadastro.modelo.CadastroCandidato;

public class CadastroCandidatoDAO {
     private EntityManager entityManager;
     
     /**
   * Construtor da classe DAO que chama os métodos do EntityManager.
   * @param entityManager
   */
     public CadastroCandidatoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
  }
     /**
   * Método para salvar ou atualizar o emprestimo.
   * @param CadastroCandidato
   * @return
   * @throws java.lang.Exception
   */        
     
        public boolean consulta(String cpf) {
          if(entityManager.find(CadastroCandidato.class, cpf)==null){
           return false;   
          }else{
              return true;
          }
           
       }
             
     public CadastroCandidato salvar(CadastroCandidato candidato, String cpf) throws Exception{
         if(consulta(cpf)==false){
              this.entityManager.persist(candidato);
              return candidato;
         }else{
             throw new Exception ();
         }
     }
     
     public CadastroCandidato atualizar (CadastroCandidato candidato, String cpf){
              this.entityManager.merge(candidato);
              return candidato;
     }
     
     public void excluir(String cpf) {
       CadastroCandidato candidato = entityManager.find(CadastroCandidato.class, cpf);
       entityManager.remove(candidato);
     }


     
}