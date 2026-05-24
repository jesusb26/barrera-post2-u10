package com.universidad.productosservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidad.productosservice.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}