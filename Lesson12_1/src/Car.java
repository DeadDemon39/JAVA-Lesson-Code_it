

public class Car {
    private Engine engine;
    private Body body;
    private Weels weels;


    public Car(Engine engine, Body body, Weels weels) {
        this.engine = engine;
        this.body = body;
        this.weels = weels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Weels getWeels() {
        return weels;
    }

    public void setWeels(Weels weels) {
        this.weels = weels;
    }

    @Override
    public String toString() {
        return "engine: " + engine + "\nbody: " + body + "\nweels: " + weels;
    }
}
