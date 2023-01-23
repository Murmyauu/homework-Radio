import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.hmradio.services.Radio;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setter-station.csv")
    public void testSetterStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(currentRadioStation);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setter-volume.csv")
    public void testSetterVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextradiostation.csv")
    public void testNextRadioStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(currentRadioStation);

        radio.next();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevradiostation.csv")
    public void testPrevRadioStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(currentRadioStation);

        radio.prev();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreasevolume.csv")
    public void testDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increasevolume.csv")
    public void testIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void testStationsSum(int currentRadioStation, int expected) {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(currentRadioStation);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}