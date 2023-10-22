import com.bashir.dto.DtoA;
import com.bashir.dto.DtoB;
import com.bashir.dto.DtoC;
import com.bashir.dto.DtoD;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        DtoD dtoD = new DtoD("Hi Guys");
        DtoC dtoC = new DtoC(dtoD);
        DtoB dtoB = new DtoB();
        DtoA dtoA = new DtoA(dtoB);

        String res = Optional.ofNullable(dtoA)
                .flatMap(dtoA1 -> Optional.ofNullable(dtoA1.getDtoB()))
                .flatMap(dtoB1 -> Optional.ofNullable(dtoB1.getDtoC()))
                .flatMap(dtoC1 -> Optional.ofNullable(dtoC1.getDtoD()))
                .map(DtoD::getValue)
                .orElse("NA");

        System.out.println("Result is: "+res);

    }
}