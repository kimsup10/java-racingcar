package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step3.domain.entity.Car;
import step3.domain.value.Location;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("자동차가 움직이여야 할 때 움직임을 확인한다.")
    void move() {
        final Car car = new Car();
        assertThat(car.play(() -> true))
                .isEqualTo(new Location(1));
    }

    @Test
    @DisplayName("자동차가 움직일 수 없을 때 멈춰있음을 확인한다.")
    void stay() {
        final Car car = new Car();
        assertThat(car.play(() -> false))
                .isEqualTo(new Location(0));
    }
}
