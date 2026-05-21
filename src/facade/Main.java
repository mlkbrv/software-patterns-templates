package facade;

class Amplifier {
    public void on() { System.out.println("Amplifier turned on."); }
    public void setVolume(int volume) { System.out.println("Setting volume to " + volume); }
}

class Projector {
    public void on() { System.out.println("Projector turned on."); }
    public void setInput(String input) { System.out.println("Projector input set to " + input); }
}

class TheaterLights {
    public void dim(int level) { System.out.println("Dimming lights to " + level + "%."); }
}

class Player {
    public void on() { System.out.println("Player turned on."); }
    public void play(String movie) { System.out.println("Playing movie: " + movie); }
}

class HomeTheaterFacade {
    private Amplifier amp;
    private Projector projector;
    private TheaterLights lights;
    private Player player;

    public HomeTheaterFacade(Amplifier amp, Projector projector, TheaterLights lights, Player player) {
        this.amp = amp;
        this.projector = projector;
        this.lights = lights;
        this.player = player;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setInput("Player");
        amp.on();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }
}

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Player player = new Player();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, lights, player);

        homeTheater.watchMovie("Interstellar");
    }
}