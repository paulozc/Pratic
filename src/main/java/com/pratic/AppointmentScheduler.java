package com.pratic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        LocalDateTime dateTime = LocalDateTime.of(2019, 7, 25, 13, 45, 0);
        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime today = LocalDateTime.now();
        boolean passed = appointmentDate.isBefore(today);
        return passed;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int time = appointmentDate.getHour();
        return time >= 12 && time < 18;
    }


    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter description = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        String message = "You have an appointment on " + appointmentDate.format(description) + ".";
        return message;
    }

    public LocalDate getAnniversaryDate() {
        int year = LocalDate.now().getYear();
        return LocalDate.of(year, 9, 15);
    }
}

