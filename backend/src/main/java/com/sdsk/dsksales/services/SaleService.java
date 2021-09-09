package com.sdsk.dsksales.services;

import com.sdsk.dsksales.dto.SaleDto;
import com.sdsk.dsksales.dto.SaleSuccessDto;
import com.sdsk.dsksales.dto.SaleSumDto;
import com.sdsk.dsksales.dto.SellerDto;
import com.sdsk.dsksales.entities.Sale;
import com.sdsk.dsksales.entities.Seller;
import com.sdsk.dsksales.repositories.SaleRepository;
import com.sdsk.dsksales.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService
{
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable)
    {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map( x -> new SaleDto(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDto> amountGroupedBySeller()
    {
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDto> successGroupedBySeller()
    {
        return saleRepository.successGroupedBySeller();
    }
}
