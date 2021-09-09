package com.sdsk.dsksales.controllers;

import com.sdsk.dsksales.dto.SaleDto;
import com.sdsk.dsksales.dto.SaleSuccessDto;
import com.sdsk.dsksales.dto.SaleSumDto;
import com.sdsk.dsksales.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController
{
    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable)
    {
        Page<SaleDto> list = saleService.findAll(pageable);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller()
    {
        List<SaleSumDto> list = saleService.amountGroupedBySeller();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDto>> successGroupedBySeller()
    {
        List<SaleSuccessDto> list = saleService.successGroupedBySeller();
        return ResponseEntity.ok().body(list);
    }
}
