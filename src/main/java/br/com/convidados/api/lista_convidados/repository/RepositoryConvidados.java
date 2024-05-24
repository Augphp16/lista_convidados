package br.com.convidados.api.lista_convidados.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convidados.api.lista_convidados.models.Convidados;

@Repository
public interface RepositoryConvidados extends CrudRepository<Convidados, Integer> {
    @SuppressWarnings("null")
    List<Convidados> findAll();
}
