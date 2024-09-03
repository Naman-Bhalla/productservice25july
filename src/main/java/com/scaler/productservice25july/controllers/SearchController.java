package com.scaler.productservice25july.controllers;

import com.scaler.productservice25july.dtos.products.GetProductDto;
import com.scaler.productservice25july.dtos.search.FilterDto;
import com.scaler.productservice25july.dtos.search.SearchResponseDto;
import com.scaler.productservice25july.dtos.search.SortingCriteria;
import com.scaler.productservice25july.models.Product;
import com.scaler.productservice25july.services.SearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/search")
public class SearchController {
    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/")
    public SearchResponseDto search(@RequestParam("query") String query,
                                    @RequestParam("filters")List<FilterDto> filters,
                                    @RequestParam("sortBy")SortingCriteria sortingCriteria,
                                    @RequestParam("pageNumber") int pageNumber,
                                    @RequestParam("pageSize") int pageSize) {
        SearchResponseDto response = new SearchResponseDto();
        Page<Product> productsPage =  searchService.search(
                query, filters, sortingCriteria, pageNumber, pageSize);

        List<GetProductDto> getProductDtos = productsPage.getContent().stream()
                .map(GetProductDto::from)
                .collect(Collectors.toList());

        Pageable pageable = PageRequest.of(productsPage.getNumber(), productsPage.getSize(), productsPage.getSort());
        Page<GetProductDto> getProductDtoPage = new PageImpl<>(getProductDtos, pageable, productsPage.getTotalElements());

        response.setProductsPage(getProductDtoPage);

        return response;
    }

    @GetMapping("/byCategory")
    public SearchResponseDto simpleSearch(@RequestParam("query") String query,
                                          @RequestParam("category") Long categoryId,
                                          @RequestParam("pageNumber") int pageNumber,
                                          @RequestParam("pageSize") int pageSize,
                                          @RequestParam("sortingAttribute") String sortingAttribute
    ) {

    }
}
