package lms;

import java.util.List;

public class Strategy {
    //use family of algorithm interchangebly,encapsulates them, and make them interchangeleble
    //you could have different strategy such as searching by name, author, publication year, or fine calculation methods

}
class Location{
    int rack,row,col;
    Location(int rack,int row, int col){
        this.rack = rack;
        this.row = row;
        this.col = col;
    }
}
//making a interface
interface SearchingStrategy{
    Location search(List<Book> books);
}

class SearchByName implements SearchingStrategy{

    @Override
    public Location search(List<Book> books) {
        return null;
    }
}

class SearchByAuthor implements SearchingStrategy{
    @Override
    public Location search(List<Book> books) {
        return null;
    }
}

class SearchBooks{
    private SearchingStrategy searchingStrategy;
    SearchBooks(SearchingStrategy searchingStrategy){
        this.searchingStrategy = searchingStrategy;
    }

    public Location search(List<Book> Books){
        return searchingStrategy.search(Books);
    }
}

