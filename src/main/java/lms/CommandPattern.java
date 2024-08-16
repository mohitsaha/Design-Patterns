package lms;

public class CommandPattern {
    //encapsulate requests as objects, allowing paramertization of request, queue, and operations
    //this pattern also support undoable pattern

    //In command Paterns objects are incapsulated in such way that no further info is required to process the objects


}

interface Command{
    void execute();
}

class IssueBookCommand implements Command{

    Library library;
    Book book;
    IssueBookCommand(Library library,Book book){
        this.library = library;
        this.book = book;
    }
    private void issueBook(){
        System.out.println("issuing book :: " + book.getTitle() + " from Library :: " + library.getLibraryName());
    }
    @Override
    public void execute() {
        issueBook();
    }
}

class CommandInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}

