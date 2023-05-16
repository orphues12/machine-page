package machinepage.domain;

import java.util.*;
import lombok.*;
import machinepage.domain.*;
import machinepage.infra.AbstractEvent;

@Data
@ToString
public class MachineAdded extends AbstractEvent {

    private Long id;

    public MachineAdded(Machine aggregate) {
        super(aggregate);
    }

    public MachineAdded() {
        super();
    }
}
