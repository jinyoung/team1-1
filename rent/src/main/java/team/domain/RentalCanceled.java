package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RentalCanceled extends AbstractEvent {

    private Long id;

    public RentalCanceled(Rent aggregate){
        super(aggregate);
    }
    public RentalCanceled(){
        super();
    }
}
