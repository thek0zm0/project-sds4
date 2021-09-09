package com.sdsk.dsksales.controllers;

import com.sdsk.dsksales.dto.SellerDto;
import com.sdsk.dsksales.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController
{
    @Autowired
    private SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll()
    {
        List<SellerDto> list = sellerService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
