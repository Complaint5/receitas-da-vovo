package com.receitas_da_vovo.dtos;

import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 * Classe reponsável por representa um data transfer object de usuario para o
 * salvamento
 */
public record SaveUserDto(
        UUID id,
        @NotBlank String name,
        @Email @NotBlank String email,
        @Min(value = 8) String password) {
}
