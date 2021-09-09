package com.sdsk.dsksales.repositories;

import com.sdsk.dsksales.dto.SaleSuccessDto;
import com.sdsk.dsksales.dto.SaleSumDto;
import com.sdsk.dsksales.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long>
{
    // JPQL
    @Query("SELECT new com.sdsk.dsksales.dto.SaleSumDto(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDto> amountGroupedBySeller();

    @Query("SELECT new com.sdsk.dsksales.dto.SaleSuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDto> successGroupedBySeller();
}
