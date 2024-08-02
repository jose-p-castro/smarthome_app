package smarthome.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

/**
 * Represents a Data Transfer Object (DTO) for a room.
 * This DTO is used to transfer room information between different layers of the application.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class RoomDTO extends RepresentationModel<RoomDTO> {

    private String
            id,
            roomName;
    private int floor;
    private double
            roomHeight,
            roomLength,
            roomWidth;
    private String houseID;
}
