package smarthome.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LogDTO extends RepresentationModel<LogDTO> {

    private String
            logID,
            time,
            reading,
            sensorID,
            deviceID,
            sensorTypeID;
}
