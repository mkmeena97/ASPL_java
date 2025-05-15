package Structural_design_pattern.Facade_design_pattern;

// Subsystem 1: DVD Player
class DvdPlayer {
    public void on() { System.out.println("DVD Player on"); }
    public void play(String movie) { System.out.println("Playing movie: " + movie); }
    public void off() { System.out.println("DVD Player off"); }
}

// Subsystem 2: Projector
class Projector {
    public void on() { System.out.println("Projector on"); }
    public void wideScreenMode() { System.out.println("Projector in widescreen mode"); }
    public void off() { System.out.println("Projector off"); }
}

// Subsystem 3: Theater Lights
class TheaterLights {
    public void dim(int level) { System.out.println("Lights dimmed to " + level + "%"); }
    public void on() { System.out.println("Lights on"); }
}

// Subsystem 4: Sound System
class SoundSystem {
    public void on() { System.out.println("Sound system on"); }
    public void setVolume(int level) { System.out.println("Sound volume set to " + level); }
    public void off() { System.out.println("Sound system off"); }
}

// Facade
class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DvdPlayer dvd, Projector proj, TheaterLights lights, SoundSystem sound) {
        this.dvdPlayer = dvd;
        this.projector = proj;
        this.lights = lights;
        this.soundSystem = sound;
    }

    public void watchMovie(String movie) {
        System.out.println("\nGet ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(20);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting movie theater down...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.on();
    }
}

// Client
public class FacadeDemo {
    public static void main(String[] args) {
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, lights, soundSystem);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}

