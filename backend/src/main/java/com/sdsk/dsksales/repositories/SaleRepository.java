package com.sdsk.dsksales.repositories;

import com.sdsk.dsksales.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long>
{
}
