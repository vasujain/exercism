import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private LocalDateTime now;
    private static long GIGASECONDS = 1000000000L;

    Gigasecond(LocalDate birthDate) {
        if ( birthDate == null ) {
            throw new NullPointerException();
        }
        this.now = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        if ( birthDateTime == null ) {
            throw new NullPointerException();
        }
        this.now = birthDateTime;
    }

    LocalDateTime getDate() {
        return now.plusSeconds(GIGASECONDS);
    }

}
