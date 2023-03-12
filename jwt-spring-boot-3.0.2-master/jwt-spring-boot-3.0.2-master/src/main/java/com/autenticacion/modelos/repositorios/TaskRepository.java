package com.autenticacion.modelos.repositorios;

import com.autenticacion.modelos.Task;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUsuarioId(Long UsuarioId);


}