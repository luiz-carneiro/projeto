/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jenyffer
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ejb.Remote;
import java.util.Date;
import javax.ejb.Stateless;

public class CadastroPessoa {
    
  private static final long serialVersionUID = 5486103235574819424L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long cpf;
  private String nome;
  private String email;
  private String sexo;
  private int data;
  private String EstadoCivil;
  private String Nacionalidade;
  private boolean filhos;
  private int telefone;
  private int celular;
  private String cep;
  private String endereco;
  private String bairro;
  private String cidade;
  private String estado;
  private String pais;
  private String areaInteresse;
  private Double pretensaoSalarial;
  private String tipoCurso;
  private String instituicaoEnsino;
  private String Curso;
  private String situacaoCurso;
  private int anoConclusao;
  private String idioma;
  private String deficiencia;
  private String projetosAnteriores;


    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getAreaInteresse() {
        return areaInteresse;
    }

    public void setAreaInteresse(String areaInteresse) {
        this.areaInteresse = areaInteresse;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isFilhos() {
        return filhos;
    }

    public void setFilhos(boolean filhos) {
        this.filhos = filhos;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    public void setPretensaoSalarial(Double pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }

    public String getProjetosAnteriores() {
        return projetosAnteriores;
    }

    public void setProjetosAnteriores(String projetosAnteriores) {
        this.projetosAnteriores = projetosAnteriores;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSituacaoCurso() {
        return situacaoCurso;
    }

    public void setSituacaoCurso(String situacaoCurso) {
        this.situacaoCurso = situacaoCurso;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
    
}
