package ar.com.ada.api.moverest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.moverest.entities.Arrendamiento;

/**
 * ArrendamientoRepository
 */
public interface ArrendamientoRepository extends JpaRepository<Arrendamiento, Integer>{

    
}