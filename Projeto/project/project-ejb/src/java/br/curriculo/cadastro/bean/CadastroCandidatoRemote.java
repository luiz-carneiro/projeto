package br.curriculo.cadastro.bean;
import javax.ejb.Remote;
import br.curriculo.cadastro.modelo.CadastroCandidato;

@Remote
public interface CadastroCandidatoRemote {

    public boolean consulta(String cpf);
    public CadastroCandidato salvar(CadastroCandidato candidato, String cpf) throws Exception;
    public CadastroCandidato atualizar (CadastroCandidato candidato, String cpf);
    public void excluir(String cpf);
    public boolean  verificaIdade(String data);
    public boolean verificaCPF(String cpf);
    public String imprimeCPF(String CPF);
}
