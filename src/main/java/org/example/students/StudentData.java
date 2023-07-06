package org.example.students;

import org.example.service.Endereco;

public record StudentData(String name, String cpf, int age, Endereco endereco, String telefone) {}

