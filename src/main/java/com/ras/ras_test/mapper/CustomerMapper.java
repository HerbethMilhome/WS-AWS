package com.ras.ras_test.mapper;

import com.ras.ras_test.dto.CustomerDto;
import com.ras.ras_test.model.CustomerModel;

public class CustomerMapper {

    private CustomerMapper(){}

    public static CustomerModel fromDtoToModel(CustomerDto dto) {
        return CustomerModel.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .cpf(dto.getCpf())
                .build();
    }

    public static CustomerModel fromModelToModel(CustomerModel curret, CustomerDto update) {
        return CustomerModel.builder()
                .id(curret.getId())
                .cpf(curret.getCpf())
                .email(curret.getEmail())
                .firstName(update.getFirstName())
                .lastName(update.getLastName())
                .build();
    }

    public static CustomerDto fromModelToDto(CustomerModel model) {
        return CustomerDto.builder()
                .id(model.getId())
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .email(model.getEmail())
                .build();
    }
}
