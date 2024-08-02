package smarthome.domain.sensortype;

import smarthome.domain.vo.sensortype.SensorTypeIDVO;
import smarthome.domain.vo.sensortype.UnitVO;

public interface SensorTypeFactory {

    SensorType createSensorType(SensorTypeIDVO sensorTypeIDVO, UnitVO unitVO);
}
