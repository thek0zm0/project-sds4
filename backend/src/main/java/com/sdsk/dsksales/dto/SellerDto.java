package com.sdsk.dsksales.dto;

import com.sdsk.dsksales.entities.Seller;

import java.io.Serializable;

public class SellerDto implements Serializable
{
    private static final long serialVersionUID = 4577746624086553328L;
    private Long id;
    private String name;

    public SellerDto(){}

    public SellerDto(Long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public SellerDto(Seller seller)
    {
        this.id = seller.getId();
        this.name = seller.getName();
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
