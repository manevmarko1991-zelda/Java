package marko_manev;

import java.util.*;

class WeatherStation {
    private ArrayList<Observer> observers = new ArrayList<>();
    private int temperature;
    
    // Methode, um einen Beobachter hinzuzufügen
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    // Methode, um einen Beobachter zu entfernen
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    // Methode, um alle Beobachter zu benachrichtigen
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
    // Methode, um die Temperatur zu aktualisieren
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

interface Observer {
    void update(int temperature);
}

class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Die aktuelle Temperatur betraegt: " + temperature + " Grad.");
    }
}

public class Weather_Main {
    public static void main(String[] args) {
        // Subjekt: Wetterstation
        WeatherStation weatherStation = new WeatherStation();

        // Beobachter: Temperaturanzeige
        TemperatureDisplay tempDisplay = new TemperatureDisplay();

        // Beobachter zur Wetterstation hinzufügen
        weatherStation.addObserver(tempDisplay);

        // Temperatur aktualisieren und alle Beobachter benachrichtigen
        weatherStation.setTemperature(25);  // Ausgabe: Die aktuelle Temperatur beträgt: 25 Grad.
        weatherStation.setTemperature(30);  // Ausgabe: Die aktuelle Temperatur beträgt: 30 Grad.
        weatherStation.setTemperature(20);  // Ausgabe: Die aktuelle Temperatur beträgt: 20 Grad.
    }
}