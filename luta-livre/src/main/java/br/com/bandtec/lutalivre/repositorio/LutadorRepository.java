package br.com.bandtec.lutalivre.repositorio;

import br.com.bandtec.lutalivre.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {

    List<Lutador> findAllByIdOrderByForcaGolpeDesc(Integer id);


    List<Lutador> findAllById(Iterable<Integer> id);


    @Query

}
