package smarthome.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class DeviceDTO extends RepresentationModel<DeviceDTO> {

    private String
            deviceID,
            deviceName,
            deviceModel,
            deviceStatus,
            roomID;
}