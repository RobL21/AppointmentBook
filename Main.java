public class Main {
    public static void main(String[] args) {

        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);

        for (byte i = 10; i < 15; i++) {

            schedule[1][i] = true;

        }


        for (byte i = 30; i < 45; i++) {

            schedule[1][i] = true;

        }

        for (byte i = 50; i < 60; i++) {

            schedule[1][i] = true;

        }

    }

}