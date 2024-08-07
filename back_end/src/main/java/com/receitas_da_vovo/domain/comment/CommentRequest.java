package com.receitas_da_vovo.domain.comment;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Classe reponsável por representa um data transfer object de comentário para o
 * salvamento
 */
public record CommentRequest(
                UUID id,
                @NotBlank String body,
                @NotNull UUID recipeId,
                @NotNull UUID ownerId) {
}
