package com.sdsk.dsksales.services;

import com.sdsk.dsksales.dto.SellerDto;
import com.sdsk.dsksales.entities.Seller;
import com.sdsk.dsksales.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService
{
    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDto> findAll()
    {
        List<Seller> result = sellerRepository.findAll();

        return result.stream().map( x -> new SellerDto(x)).collect(Collectors.toList());
    }
}
