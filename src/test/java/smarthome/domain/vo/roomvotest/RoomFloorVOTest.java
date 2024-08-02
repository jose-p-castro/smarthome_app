package smarthome.domain.vo.roomvotest;

import org.junit.jupiter.api.Test;
import smarthome.domain.vo.roomvo.RoomFloorVO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RoomFloorVOTest {

    @Test
    void getRoomFloor_Test() {
        //Arrange
        int floor = 5;
        //Act
        RoomFloorVO roomFloor = new RoomFloorVO(floor);
        int result = roomFloor.getValue();
        //Assert
        assertEquals(floor, result);
    }

    @Test
    void roomFloor_objectCreation_Test() {
        //Arrange
        int floor = -5;
        //Act
        RoomFloorVO roomFloor = new RoomFloorVO(floor);
        //Assert
        assertNotNull(roomFloor);
    }

}