package com.scaler.productservice25july.dtos.search;

import com.scaler.productservice25july.dtos.products.GetProductDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
public class SearchResponseDto {
    private Page<GetProductDto> productsPage;
}
