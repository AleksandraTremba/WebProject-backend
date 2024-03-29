package ee.taltech.iti0302.okapi.backend.dto.records;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecordsDTO {

    private Long id;

    private Integer numberOfCustomers;

    private Integer numberOfTimers;

    private Integer numberOfGroups;

    private Integer numberOfTasks;
}
