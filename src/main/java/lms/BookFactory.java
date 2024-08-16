package lms;

//Factory pattern is used to instigate object with custom parameter it takes away the complexity of
// initiaing the object
abstract class Book{
    String title;
    public String getTitle() {
        return title;
    }
}
class FictionBook extends Book{
    FictionBook(String title){
        this.title = title;
    }
}
class AdventureBook extends Book{
    AdventureBook(String title){
        this.title = title;
    }
}
public class BookFactory {
    //Static method is neccassry as we don't need to insitate this method
    public static Book createBook(String type,String title){
        if(type.equalsIgnoreCase("Adventure")){
            return new AdventureBook(title);
        }else if(type.equalsIgnoreCase("Fiction")){
            return new FictionBook(title);
        }else{
            return null;
        }
    }
}
