package br.curriculo.cadastro.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name ="Cadastro_Candidato")
public class CadastroCandidato implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(unique=true, nullable=false)

private String cpf;
private String nome;
private String email;
private String confirma_Email;
private boolean sexo;
@Temporal(javax.persistence.TemporalType.DATE)
private Date data_nasc;
private String estado_civil;
private String nacionalidade;
private boolean filhos;
private int telefone;
private int celular;
private int cep;
private String endereco;
private String bairro;
private String cidade;
private String pais;
private String area_interesse;
private String tipo_curso;
private String instituicao;
private String curso;
private int ano_conclusao;
private String situacao;
private String idioma;
private String nivel;
private boolean deficiencia;
private String tipo_deficiência;
private String projetos_anteriores;


    public int getAno_conclusao() {
        return ano_conclusao;
    }

    public void setAno_conclusao(int ano_conclusao) {
        this.ano_conclusao = ano_conclusao;
    }

    public String getArea_interesse() {
        return area_interesse;
    }

    public void setArea_interesse(String area_interesse) {
        this.area_interesse = area_interesse;
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getConfirma_Email() {
        return confirma_Email;
    }

    public void setConfirma_Email(String confirma_Email) {
        this.confirma_Email = confirma_Email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public boolean isDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(boolean deficiencia) {
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

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
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

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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

    public String getProjetos_anteriores() {
        return projetos_anteriores;
    }

    public void setProjetos_anteriores(String projetos_anteriores) {
        this.projetos_anteriores = projetos_anteriores;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getTipo_curso() {
        return tipo_curso;
    }

    public void setTipo_curso(String tipo_curso) {
        this.tipo_curso = tipo_curso;
    }

    public String getTipo_deficiência() {
        return tipo_deficiência;
    }

    public void setTipo_deficiência(String tipo_deficiência) {
        this.tipo_deficiência = tipo_deficiência;
    }


}
