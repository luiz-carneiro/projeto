/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import javax.ejb.Stateless;
/**
 *
 * @author Jenyffer
 */
@Stateless (mappedName="ejb/CadastroPessoa")
public class VerificaIdade{
   
    public boolean verificaIdade(String data){
        int dia = new Integer( data.substring(0, 2));
        int mes = new Integer( data.substring(3, 5));;
        int ano = new Integer( data.substring(6, 10));;
         
        Date dataNascimento = new Date();
        dataNascimento.setDate(dia);
        dataNascimento.setMonth(mes);
        dataNascimento.setYear(ano);
        
        Date dataAtual = new Date();
        dataAtual.setHours(0);
        
        return true;
    }
   
}
