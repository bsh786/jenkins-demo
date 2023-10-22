package com.bashir.dto;

public class DtoC {

    private DtoD dtoD;

    public DtoC() {
    }

    public DtoC(DtoD dtoD) {
        this.dtoD = dtoD;
    }

    public DtoD getDtoD() {
        return dtoD;
    }

    public void setDtoD(DtoD dtoD) {
        this.dtoD = dtoD;
    }
}
