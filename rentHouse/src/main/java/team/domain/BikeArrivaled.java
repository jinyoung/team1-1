package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BikeArrivaled extends AbstractEvent {

    private Long id;

    public BikeArrivaled(Management aggregate){
        super(aggregate);
    }
    public BikeArrivaled(){
        super();
    }
}
