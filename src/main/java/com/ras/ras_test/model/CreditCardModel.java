package com.ras.ras_test.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("creditCard")
@Builder
public class CreditCardModel implements Serializable {

    @Id
    private String id;

    @NotBlank
    private String number;

    @NotNull
    private Long cvv;

    @NotNull
    private Long month;

    @NotNull
    private Long year;

    @NotBlank
    private String documentNumber;

    @NotNull
    private Long installments;

    @NotBlank
    private String customerId;
}
