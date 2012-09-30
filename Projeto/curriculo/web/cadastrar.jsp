<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        
        <script language="javascript">
function VerificaCPF () {
if (vercpf(document.cadastro.cpf.value)) 
{document.cadastro.submit();}else 
{errors="1";if (errors) alert('CPF NÃO VÁLIDO');
document.retorno = (errors == '');}}
function vercpf (cpf) 
{if (cpf.length != 11 || cpf == "00000000000" || cpf == "11111111111" || cpf == "22222222222" || cpf == "33333333333" || cpf == "44444444444" || cpf == "55555555555" || cpf == "66666666666" || cpf == "77777777777" || cpf == "88888888888" || cpf == "99999999999")
return false;
add = 0;
for (i=0; i < 9; i ++)
add += parseInt(cpf.charAt(i)) * (10 - i);
rev = 11 - (add % 11);
if (rev == 10 || rev == 11)
rev = 0;
if (rev != parseInt(cpf.charAt(9)))
return false;
add = 0;
for (i = 0; i < 10; i ++)
add += parseInt(cpf.charAt(i)) * (11 - i);
rev = 11 - (add % 11);
if (rev == 10 || rev == 11)
rev = 0;
if (rev != parseInt(cpf.charAt(10)))
return false;
return true;}
</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="css/static.css" type="text/css" rel="stylesheet" media="screen" />
    </head>
    <body>
        <div class="header outras_pg">
            <div class="content_header">
                <a href="index.jsp" class="logo_site"><img src="images/logo_mack.gif" alt="mack2" /></a>
                <ul class="lista">
                    <li><a href=")">Empresas</a></li>
                    <li><a href="">Currículo</a></li>
                    <li><a href="">Oportunidades</a></li>
                    <li><a href="cadastrar.jsp">Cadastro</a></li>
                    <li><a href="">Contato</a></li>
                    <li><a href="">Acesso</a></li>
                </ul>
                <img src="images/cadastro_mack.jpg" class="img_header" alt=""/>
                <a href="javascript:void(0)" class="icon bot_home">home</a>
            </div>
        </div>
        <h1 class="principal_title">Cadastro</h1>
        <div class="box_round">
            <div class="cadastro_top_box"></div>
            <div class="cadastro_center_box">
                <div class="header_box_2">
                    <h2 class="title_header">Nosso endereço</h2>
                </div>
                <div class="gridForm ml40">
                    <p class="content_cadastro">Faça seu cadastro através do formulário abaixo:</p>
                    
                    

                    <form  name="cadastro" class="form_comente" method="post" action="cadastrar.jsp" onsubmit="VerificaCPF();">
                        <p> <label>CPF:</label>
                            <input type="text" name="cpf" size="12" maxlength="11"class="campos"/>
                            
                        <p><label>Nome:</label>
                            <input type="text" name="nome" class="campos"/>
                        <p><label>Email:</label>
                            <input type="text" name="email" class="campos" />
                        <p><label>Confirma email:</label>
                            <input type="text" name="verificacao_email" class="campos" />
                            
                         <p><label>Sexo:</label>
                            <select name="sexo">
                                <option value="true" class="campos">Feminino</option>
                                <option value="false" class="campos">Masculino</option>
                            </select>    
                        </p>   
                        
                         <p><label>Data de Nascimento:</label>
                            <input type="text" name="data_nascimento" class="campos"/>
                        </p>
                        
                        <p><label>Estado Civil:</label>
                            <select name="estado_civil">
                                <option value="Solteiro" class="campos">Solteiro(a)</option>
                                <option value="Casado" class="campos">Casado(a)</option>
                                <option value="Viúvo" class="campos">Viúvo(a)</option>
                                <option value="Separado" class="campos">Separado(a)</option>
                            </select>    
                        </p>
                        
                         <p><label>Nacionalidade:</label>
                            <input type="text" name="nacionalidade" class="campos"/>
                        </p>
                        
                        <p><label>Filhos:</label>
                            <select name="filhos">
                                <option value="true" class="campos">Sim</option> 
                                <option value="false" class="campos">Não</option> 
                            </select>
                        </p>
                        
                         <p><label>Telefone:</label>
                            <input type="text" name="telefone" class="campos" />
                        </p>
                        
                        <p><label>Celular:</label>
                            <input type="text" name="celular" class="campos" />
                        </p>
                        
                        <p><label>CEP:</label>
                            <input type="text" name="cep" class="campos" />
                        </p>
                        
                        <p><label>Endereço:</label>
                            <input type="text" name="endereco" class="campos" />
                        </p>
                        
                        <p><label>Bairro:</label>
                            <input type="text" name="bairro" class="campos" />
                        </p>
                        
                         <p><label>Cidade:</label>
                            <input type="text" name="cidade" class="campos" />
                        </p>                   

                        <p><label>Estado:</label>
                            <select name="estado">
                                <option value="SP" class="campos">SP</option>
                                <option value="RJ" class="campos">RJ</option>
                                <option value="MG" class="campos">MG</option>
                                <option value="PR" class="campos">PR</option>
                                <option value="BA" class="campos">BA</option>
                                <option value="RS" class="campos">RS</option>
                            </select>
                        </p>


                         <p><label>País:</label>
                            <select name="pais">
                                <option value="Argentina" class="campos">Argentina</option>
                                <option value="Austrália" class="campos">Austrália</option>
                                <option value="Brasil" class="campos">Brasil</option>
                                <option value="Canadá" class="campos">Canadá¡</option>
                                <option value="Colombia" class="campos">Colombia</option>
                                <option value="Dinamarca" class="campos">Dinamarca</option>
                                <option value="Equador" class="campos">Equador</option>
                                <option value="Estados Unidos" class="campos">Estados Unidos</option>
                                <option value="Finlândia" class="campos">Finlândia</option>
                                <option value="França" class="campos">França</option>
                                <option value="Guatemala" class="campos">Guatemala</option>
                                <option value="Inglaterra" class="campos">Inglaterra</option>
                                <option value="Noruega" class="campos">Noruega</option>
                                <option value="Polônia" class="campos">Polônia</option>
                                <option value="Rússia" class="campos">Rússia</option>
                                <option value="Suiça" class="campos">Suiça</option>
                                <option value="Uruguai" class="campos">Uruguai</option>
                            </select>
                        </p>
                        
                         <p><label>Áreas de interesse:</label>
                            <select name="area_atauacao">
                               <option value="Auditoria" class="campos">Auditoria</option>
                               <option value="Biologia" class="campos">Biologia</option>
                               <option value="Comercial" class="campos">Comercial</option>
                               <option value="Construção Civil" class="campos">Construção Civil</option>
                               <option value="Educação" class="campos">Educação</option>
                               <option value="Enfermagem" class="campos">Enfermagem</option>
                               <option value="Engenharia" class="campos">Engenharia</option>
                               <option value="Jornalismo" class="campos">Jornalismo</option>
                               <option value="Tecnologia da informação" class="campos">Tecnologia da informação</option>
                               
                            </select></p>

                        <p><label>Pretensão Salarial:</label>
                            <input type="text" name="pretensao_salarial" class="campos" />
                        </p>
                            
                        <p><label>Tipo do curso:</label>
                            <select name="tipo_curso">
                                <option value="tecnologo" class="campos">Tecnólogo</option>
                                <option value="bacharelado" class="campos">Bacharelado</option>
                                <option value="licenciatura" class="campos">Licenciatura</option>
                            </select>
                        </p>
                        <p><label>Instituição de Ensino:</label>
                            <select name="universidade">
                                <option value="mackenzie" class="campos">Mackenzie</option>
                                <option value="puc" class="campos">PUC-SP</option>
                                <option value="usp" class="campos">USP</option>
                                <option value="unifesp" class="campos">UNIFESP</option>
                                <option value="unesp" class="campos">UNESP</option>
                                <option value="anhanguera" class="campos">Anhanguera</option>
                                <option value="unip" class="campos">UNIP</option>
                                <option value="uninove" class="campos">Uninove</option>
                                <option value="Outras" class="campos">Outras</option>
                            </select>
                        </p>
                        <p><label>Curso:</label>
                            <input type="text" name="curso" class="campos" />
                        </p>
                        
                         <p><label>Situação do curso:</label>
                            <select name="situacao_curso">
                                <option value="cursando" class="campos">Cursando</option>
                                <option value="trancado" class="campos">Matricula Trancada</option>
                                <option value="Concluido" class="campos">Concluído</option>                            
                            </select>
                         </p>
                         
                        <p><label>Ano de conclusão:</label>
                            <input type="text" name="ano_conclusao" class="campos" />
                        </p>
                        <p><label>Idiomas:</label>
                            <select name="idiomas">
                                <option value="Não informado" class="campos">Não informado</option>
                                <option value="Inglês" class="campos">Inglês</option>
                                <option value="Espanhol" class="campos">Espanhol</option>
                                <option value="Outros" class="campos">Outros</option>
                            </select>
                        </p>
                        <p><label>Nível:</label>
                            <select name="nivel">
                                <option value="Básico" class="campos">Básico</option>
                                <option value="Intermediário" class="campos">Intermediário</option>
                                <option value="Avançado" class="campos">Avançado</option>
                                <option value="Fluente" class="campos">Fluente</option>
                            </select>
                        </p>
                        <p><label>Deficiência:</label>
                           <select name="deficiencia">
                              <option value="sim" class="campos">Sim</option>
                              <option value="nao" class="campos">Não</option>
                        </select>
                        </p> 
                        
                        <p><label>Tipo de deficiência:</label>
                            <input type="text" name="tipo_deficiencia" class="campos" />
                            
                            
                        <p><label>Projetos anteriores:</label>
                            <input type="text" name="projetos_anteriores" class="campos" />
                        </p>
                        <br></br>
                        
                        <input type="submit" onclick="VerificaCPF();" </input>
                    </form>
                </div>
                <div class="gridCadastro ml45">
                    <p class="title_cadastro">Grupo MackVagas</p>
                    <p class="content_cadastro">Rua da Consolação,930</p>
                    <p class="content_cadastro">Consolação - São Paulo - SP</p>
                    <p class="content_cadastro">CEP 01302-907</p>
                    <p class="content_cadastro">Telefone: (11) 2114-8000</p>
                </div>
                 <div class="clearFull"></div>
            </div>
            <div class="cadastro_down_box"></div>
        </div>
        <div class="sub_footer">
        </div>

        <div class="footer">
            <a href="" class="logo_footer"><img src="images/logo_footer.gif" alt="Mack" /></a>
            <p class="adress_footer">Rua da Consolação, 930 - Consolação - São Paulo - SP - CEP 01302-907 </p>
            <p class="phone_footer"> Fone (11) 2114-8000</p>
            <div class="subre_footer">
                <p class="direitos_reservados">GRUPO MACKVAGAS  |  Todos os direitos reservados.</p>
                <p class="web_by">Web by Mackenzistas</p>
            </div>
        </div>
    </body>
</html>
