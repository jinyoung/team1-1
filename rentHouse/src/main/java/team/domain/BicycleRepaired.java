package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BicycleRepaired extends AbstractEvent {

    private Long id;

    public BicycleRepaired(Management aggregate){
        super(aggregate);
    }
    public BicycleRepaired(){
        super();
    }
}
