package ee.taltech.iti0302.okapi.backend.dto.timer;


import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
public class TimerDTO {
    @NotNull
    private Long id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // In ms
    @NotNull
    private Integer runningTime;
    private Long remainingTime;
}
