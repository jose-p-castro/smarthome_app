package smarthome.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

/**
 * Data Transfer Object that contains the actuator ID, name, type and device ID.
 * It is also contains the lower limit, upper limit and precision of the actuator for specific Actuators.
 * It is used to transfer data between the Actuator class and the ActuatorMapper class.
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ActuatorDTO extends RepresentationModel<ActuatorDTO> {

    private String
            actuatorId,
            actuatorName,
            actuatorTypeID,
            deviceID,
            lowerLimit,
            upperLimit,
            precision,
            status;
}
