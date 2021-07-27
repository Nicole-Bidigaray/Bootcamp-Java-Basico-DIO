package oo.cliente.mundoreal;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("Endereço não pode ser nulo");
//            a maneira de colocar o erro acima não é a correta
        }

        if (endereco.cep == null) {
            throw new NullPointerException("Cep não pode ser nulo");
        }

        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }


}
