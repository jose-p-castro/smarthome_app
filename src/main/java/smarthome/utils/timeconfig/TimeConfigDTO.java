package smarthome.utils.timeconfig;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class TimeConfigDTO extends RepresentationModel<TimeConfigDTO> {

    private String
            initialDate,
            initialTime,
            endDate,
            endTime,
            deltaMin;
}