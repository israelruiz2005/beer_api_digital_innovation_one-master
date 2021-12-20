package com.github.israelruiz2005.beerstock.mapper;

import com.github.israelruiz2005.beerstock.dto.BeerDTO;
import com.github.israelruiz2005.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
