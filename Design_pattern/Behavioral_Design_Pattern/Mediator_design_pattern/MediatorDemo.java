package Behavioral_Design_Pattern.Mediator_design_pattern;

import java.util.HashMap;
import java.util.Map;

// Client
public class MediatorDemo {
    public static void main(String[] args) {
        ChatMediator chatRoom = new TeamChatRoom();

        User mahendra = new TeamMember("Mahendra", chatRoom);
        User tilak = new TeamMember("Tilak", chatRoom);
        User rituraj = new TeamMember("Rituraj", chatRoom);
        User tejas = new TeamMember("Tejas", chatRoom);

        chatRoom.addUser(mahendra);
        chatRoom.addUser(tilak);
        chatRoom.addUser(rituraj);
        chatRoom.addUser(tejas);

        mahendra.send("Hello team, please update your work status.");
        tejas.send("Sure! I’ve completed the weekly report.");
    }
}

