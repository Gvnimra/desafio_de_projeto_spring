package desafio_de_projeto.desafio_de_projeto_spring.Service.impl;

import desafio_de_projeto.desafio_de_projeto_spring.Model.Cliente;
import desafio_de_projeto.desafio_de_projeto_spring.Service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos(){
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id){
        return null;
    }

    @Override
    public void inserir(Cliente cliente){

    }

    @Override
    public void atualizar(Long id, Cliente cliente){

    }

    public void deletar(Long id){

    }
}
