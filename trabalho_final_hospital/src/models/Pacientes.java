
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hemilio
 */
public class Pacientes {
    private String nome;
    private String cpf;
    private String nascimento;
    private String sexo;

    public Pacientes(String nome, String cpf, String nascimento, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int idade() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date inicial = sdf.parse(this.nascimento);
        Date atual = new Date();
        
        long diferencaMillis = Math.abs(atual.getTime() - inicial.getTime());
        
        long diff = TimeUnit.DAYS.convert(diferencaMillis, TimeUnit.MILLISECONDS);
        
        int anos = (int) Math.abs(diff/365);
        
        return anos;
    }
}
