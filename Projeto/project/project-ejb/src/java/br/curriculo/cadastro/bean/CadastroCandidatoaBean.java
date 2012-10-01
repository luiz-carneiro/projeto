package br.curriculo.cadastro.bean;

import br.curriculo.cadastro.bean.CadastroCandidatoRemote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.curriculo.cadastro.modelo.CadastroCandidato;
import br.curriculo.cadastro.dao.CadastroCandidatoDAO;
import java.util.Date;
import java.util.InputMismatchException;

@Stateless
public class CadastroCandidatoaBean implements CadastroCandidatoRemote{

      @PersistenceContext(unitName = "CadastroCandidato")
       private EntityManager em;
      
    public boolean consulta(String cpf) {
        CadastroCandidatoDAO dao = new CadastroCandidatoDAO(em);
        return dao.consulta(cpf);
    }

    @Override
    public CadastroCandidato salvar(CadastroCandidato candidato, String cpf) throws Exception {
            CadastroCandidatoDAO dao = new CadastroCandidatoDAO(em);
            return dao.salvar(candidato, cpf);
    }

  
    public CadastroCandidato atualizar(CadastroCandidato candidato, String cpf) {
        CadastroCandidatoDAO dao = new CadastroCandidatoDAO(em);
        return dao.atualizar(candidato, cpf);
    }

    public void excluir(String cpf){
        CadastroCandidatoDAO dao = new CadastroCandidatoDAO(em);
        dao.excluir(cpf);
    }
    
    public boolean verificaIdade(String data){
        int dia = new Integer( data.substring(0, 2));
        int mes = new Integer( data.substring(3, 5));
        int ano = new Integer( data.substring(6, 10));
         
        Date dataNascimento = new Date();
        dataNascimento.setDate(dia);
        dataNascimento.setMonth(mes);
        dataNascimento.setYear(ano);
        
        Date dataAtual = new Date();
        dataAtual.setHours(0);
        
        return true;
    }
     public boolean verificaCPF(String CPF) {
// considera-se erro CPF's formados por uma sequencia de numeros iguais
    if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
        CPF.equals("22222222222") || CPF.equals("33333333333") ||
        CPF.equals("44444444444") || CPF.equals("55555555555") ||
        CPF.equals("66666666666") || CPF.equals("77777777777") ||
        CPF.equals("88888888888") || CPF.equals("99999999999") ||
       (CPF.length() != 11))
       return(false);
 
    char dig10, dig11;
    int sm, i, r, num, peso;
    
    try {
// Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 10;
      for (i=0; i<9; i++) {             
// converte o i-esimo caractere do CPF em um numero:
// por exemplo, transforma o caractere '0' no inteiro 0        
// (48 eh a posicao de '0' na tabela ASCII)        
        num = (int)(CPF.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }
 
      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig10 = '0';
      else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
 
// Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 11;
      for(i=0; i<10; i++) {
        num = (int)(CPF.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }
 
      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig11 = '0';
      else dig11 = (char)(r + 48);
 
// Verifica se os digitos calculados conferem com os digitos informados.
      if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }
 
  public String imprimeCPF(String CPF) {
    return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
      CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
  }



}
