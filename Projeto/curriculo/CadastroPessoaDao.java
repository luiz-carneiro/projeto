/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.persistence.EntityManager;

public class CadastroPessoaDao {

/**
 * Classe utilizada para realizar as operações com o bando de dados.
 */
  private EntityManager entityManager;

  /**
   * Construtor da classe DAO que chama os métodos do EntityManager.
   * @param entityManager
   */
  public CadastroPessoaDAO(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  /**
   * Método para salvar ou atualizar a pessoa.
   * @param pessoa
   * @return
   * @throws java.lang.Exception
   */
  public CadastroPessoa salvar(CadastroPessoa pessoa) throws Exception{
    System.out.println("Salvando a pessoa: " + pessoa.getNome());
    /* Verifica se a pessoa ainda não está salva no banco de dados. */
    if(pessoa.getCpf() == null) {
      /* Salva a pessoa no banco de dados. */
      this.entityManager.persist(pessoa);
    } else {
      /* Verifica se a pessoa não está no estado managed. */
      if(!this.entityManager.contains(pessoa)) {
        /* Se a pessoa não está no estado managed verifica se ele existe na base. */
        if (entityManager.find(CadastroPessoa.class, pessoa.getCpf()) == null) {
          throw new Exception("Pessoa não existe!");
        }
      }
      /* Faz uma atualização da pessoa que estava gravado na base de dados. */
      return entityManager.merge(pessoa);
    }
    /* Retorna a pessoa que foi salva, este retorno ocorre para modemos ter o cpf que foi salvo. */
    return pessoa;
  }

  /**
   * Método que exclui a pessoa do banco de dados.
   * @param cpf
   */
  public void excluir(Long id) {

    CadastroPessoa pessoa = entityManager.find(CadastroPessoa.class, id);
    System.out.println("Excluindo a pessoa: " + pessoa.getNome());
    /* Remove a pessoa da base de dados. */
    entityManager.remove(pessoa);
  }

  public CadastroPessoa consultarPorCpf(Long cpf) {
    return entityManager.find(CadastroPessoa.class, cpf);
  }
}

