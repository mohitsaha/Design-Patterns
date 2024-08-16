package lms;

public class SingeltonLibrary {
    private SingeltonLibrary() {
        //added private consturctor so no one can institate
    }
    private static SingeltonLibrary instance;

    public static synchronized SingeltonLibrary getInstance(){
        //Synchronized keyword ensures that only one thread can access this section in multithreaded enviromnent
        if(instance == null){
            instance = new SingeltonLibrary();
        }
        return instance;
    }
}


//Multithreading leaning
//using Library.class as Lock this will all static methods + all methods who uses Library.class as lock
class Library {
    private static Library instance;
    private static final String libraryName = "Block A library";
    private Library() {
        // Private constructor
    }

    public static Library getInstance() {
        if (instance == null) {
            synchronized (Library.class) { // Lock on the Class object
                if (instance == null) {
                    instance = new Library();
                }
            }
        }
        return instance;
    }

    public static synchronized void someStaticMethod() {
        // This method also synchronizes on Library.class
        System.out.println("Some static method");
    }

    public void someInstanceMethod() {
        synchronized (Library.class) {
            // This block also synchronizes on Library.class
            System.out.println("Some instance method");
        }
    }

    public String getLibraryName(){
        return libraryName;
    }
}

