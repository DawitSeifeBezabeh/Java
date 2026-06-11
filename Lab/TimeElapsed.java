import java.util.Scanner;

public class TimeElapsed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first time (HH:MM:SS AM/PM): ");
        String time1 = scanner.nextLine();
        System.out.print("Enter the second time (HH:MM:SS AM/PM): ");
        String time2 = scanner.nextLine();

        int seconds1 = toSeconds(time1);
        int seconds2 = toSeconds(time2);

        int diff = seconds2 - seconds1;
        if (diff < 0) {
            diff += 24 * 60 * 60; // wrap around midnight
        }

        int minutes = diff / 60;
        int secs = diff % 60;

        System.out.println("Time elapsed is " + minutes + " minutes and " + secs + " seconds.");
    }

    public static int toSeconds(String time) {
        String[] parts = time.trim().split("[:\\s]+");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2]);
        String ampm = parts[3].toUpperCase();

        if (hour == 12) {
            hour = 0;
        }
        if (ampm.equals("PM")) {
            hour += 12;
        }

        return hour * 3600 + minute * 60 + second;
    }
}