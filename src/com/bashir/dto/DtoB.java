package com.bashir.dto;

public class DtoB {

    private DtoC dtoC;

    public DtoB() {}

    public DtoB(DtoC dtoC)
    {
        this.dtoC = dtoC;
    }

    public DtoC getDtoC() {
        return dtoC;
    }

    public void setDtoC(DtoC dtoC) {
        this.dtoC = dtoC;
    }
}
