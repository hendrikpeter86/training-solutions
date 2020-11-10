package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for(MeetingRoom meetingRoom: meetingRooms){
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse(){

    }

    public void printEventNames(){

    }

    public void Areas(){

    }

    public void MeetingRoomsWithName (String name) {

    }

    public void MeetingRoomsContains (String part) {

    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom: meetingRooms){
            if(meetingRoom.getArea() > area) {
                System.out.println(meetingRoom.getName() + " (" + meetingRoom.getWidth() + " * "
                        + meetingRoom.getLenght() + " = " + meetingRoom.getArea() + ")");
            }
        }
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }
}
