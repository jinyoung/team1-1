package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Returned extends AbstractEvent {

    private Long id;

    public Returned(Rent aggregate){
        super(aggregate);
    }
    public Returned(){
        super();
    }
}
