

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.ejb.Remote;
/**
 *
 * @author Jenyffer
 */
@Remote
public interface VerificaData {
    
    public boolean  verificaIdade(String data);
}
