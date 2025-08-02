
// Date and Time
// import java.time. (LocalDate, LocalTime, LocalDateTime)
// Task - import.java.time.format,DateTimeFormatter
// 1. yyyy-MM-dd - 2025-07-12
// 2. dd/MM/yyyy - 12/07/2025
// 3. dd-MMM-yyyy - 12-Jul-2025
// 4. E, MMM dd yyyy - Sat, Jul 12 2025
// import java.time.LocalDate;
// import java.time.LocalTime;
import java.time.LocalDateTime;

class Main {

    public static void main(String[] args) {
        // LocalDate answer = LocalDate.now();
        // System.out.println(answer);

        // LocalTime answer=LocalTime.now();
        // System.out.println(answer);
        LocalDateTime answer = LocalDateTime.now();
        System.out.println(answer);
    }
}
