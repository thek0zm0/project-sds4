package com.sdsk.dsksales.dto;

import com.sdsk.dsksales.entities.Seller;

import java.io.Serializable;

public class SaleSuccessDto implements Serializable
{

    private static final long serialVersionUID = 5583309496534398758L;
    private String name;
    private Long visited;
    private Long deals;

    public SaleSuccessDto(){}

    public SaleSuccessDto(Seller seller, Long visited, Long deals)
    {
        this.name = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Long getVisited()
    {
        return visited;
    }

    public void setVisited(Long visited)
    {
        this.visited = visited;
    }

    public Long getDeals()
    {
        return deals;
    }

    public void setDeals(Long deals)
    {
        this.deals = deals;
    }
}
