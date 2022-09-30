package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class BikeRepairCompleted extends AbstractEvent {

    private Long productId;
    private String productName;
    private Long rentUnitPrice;
    private Boolean rentAvailable;

    public BikeRepairCompleted(Management aggregate) {
        super(aggregate);
    }

    public BikeRepairCompleted() {
        super();
    }
}
