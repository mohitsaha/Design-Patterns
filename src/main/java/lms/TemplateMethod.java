package lms;

public class TemplateMethod {
    //in template method we defined some common method is common accros the classes
}

abstract class BookOperation{
    public final void process(){
        selectBook();
        performOperation();
        updateCatalog();
    }
    protected abstract void selectBook();
    protected abstract void performOperation();

    protected void updateCatalog(){
        System.out.println("catalog is updated");
    }
}

class IssueBookOperation extends BookOperation {
    protected void selectBook() {
        System.out.println("Book selected for issuing.");
    }

    protected void performOperation() {
        System.out.println("Book issued.");
    }
}

class ReturnBookOperation extends BookOperation {
    protected void selectBook() {
        System.out.println("Book selected for return.");
    }

    protected void performOperation() {
        System.out.println("Book returned.");
    }
}