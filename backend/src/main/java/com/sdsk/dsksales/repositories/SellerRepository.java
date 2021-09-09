package com.sdsk.dsksales.repositories;

import com.sdsk.dsksales.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long>
{
}
