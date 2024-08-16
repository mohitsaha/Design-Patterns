package lms;

import java.util.ArrayList;
import java.util.List;

public interface Observer{
    void update(String message);
}

class Member implements Observer{
    private String name;

    public Member(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
       System.out.println(name + "recieved messse" + message);
    }

    public String getName(){
        return name;
    }
}

class LibraryNotifier{
    List<Observer> observersList = new ArrayList<>();
    public void addObserver(Observer observer){
        observersList.add(observer);
    }
    public void notifyObserver(){
        for (Observer observer: observersList) {
            observer.update("notify by notifier");
        }
    }
}