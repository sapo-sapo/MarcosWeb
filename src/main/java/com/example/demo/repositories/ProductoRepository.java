package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByCategoriaIdCategoria(Long idCategoria);

    List<Producto> findTop3ByOrderByIdProductoAsc();

    List<Producto> findByIdProductoIn(List<Integer> ids);

    List<Producto> findTop6ByOrderByIdProductoAsc();
}