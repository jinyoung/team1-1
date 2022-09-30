package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class BicycleRepaired extends AbstractEvent {

    private Long productId;
    private String productName;
    private Long rentUnitPrice;
    private Boolean rentAvailable;

    public BicycleRepaired(Management aggregate) {
        super(aggregate);
    }

    public BicycleRepaired() {
        super();
    }
}
