package smarthome.persistence;

import smarthome.domain.device.Device;
import smarthome.domain.vo.devicevo.DeviceIDVO;
import smarthome.domain.vo.roomvo.RoomIDVO;

public interface DeviceRepository extends Repository<DeviceIDVO, Device> {

    Iterable<Device> findByRoomID(RoomIDVO roomID);

    boolean update(Device device);
}
