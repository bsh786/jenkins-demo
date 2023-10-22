package com.bashir.dto;

public class DtoA {

    private DtoB dtoB;

    public DtoA()
    {

    }

    public DtoA(DtoB dtoB)
    {
        this.dtoB = dtoB;
    }

    public DtoB getDtoB() {
        return dtoB;
    }

    public void setDtoB(DtoB dtoB) {
        this.dtoB = dtoB;
    }
}
