package com.adriel.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriel.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
