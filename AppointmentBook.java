public class AppointmentBook{
    private boolean[][] schedule;

    public AppointmentBook(boolean[][] schedule){
        
        this.schedule = schedule;

    }

    private boolean isMinuteFree(int perid, int minute){
        return schedule[period -1 ][minute];
    }

    



}