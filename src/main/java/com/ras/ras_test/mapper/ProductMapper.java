package com.ras.ras_test.mapper;

import com.ras.ras_test.dto.ProductDto;
import com.ras.ras_test.model.ProductModel;

public class ProductMapper {

    private ProductMapper(){}

    public static ProductModel fromDtoToModel(ProductDto
                                                      dto) {
        return ProductModel.builder()
                .id(dto.getId())
                .name(dto.getName())
                .acronym(dto.getAcronym().toUpperCase())
                .currentPrice(dto.getCurrentPrice())
                .build();
    }

    public static ProductDto fromModelToDto(ProductModel model) {
        return ProductDto.builder()
                .id(model.getId())
                .name(model.getName())
                .acronym(model.getAcronym().toUpperCase())
                .currentPrice(model.getCurrentPrice())
                .build();
    }
}
