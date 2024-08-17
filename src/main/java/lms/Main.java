package lms;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Library library = Library.getInstance();

        // Factory
        Book book1 = BookFactory.createBook("Fiction", "1984");
        Book book2 = BookFactory.createBook("NonFiction", "Sapiens");
        library.addBook(book1);
        library.addBook(book2);

        // Observer
        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");
        LibraryNotifier notifier = new LibraryNotifier();
        notifier.addObserver(member1);
        notifier.addObserver(member2);
        notifier.notifyObservers("New book added to the library: " + book1.getTitle());

        // Decorator
        PremiumMember premiumMember = new PremiumMember(member1);
        premiumMember.accessPremiumContent();

        // Strategy
//        MemberFeeCalculator calculator = new MemberFeeCalculator(new PremiumFeeStrategy());
//        System.out.println("Late fee: " + calculator.calculate(5));
//
        // Command
        Command issueBookCommand = new IssueBookCommand(library, book1);
        CommandInvoker invoker = new CommandInvoker();
        invoker.setCommand(issueBookCommand);
        invoker.invoke();

        // Proxy
        LibraryAccess proxyAccess = new ProxyLibraryAccess("Charlie");
        proxyAccess.requestAccess("Charlie");

        // Adapter
        OldPaymentGateway payment = new PaymentGatewayAdapter(new StripePaymentGateway());
        payment.payThroughPaypal(529);

        // Builder
        UserProfile profile = new UserProfile.UserProfileBuilder()
                .setName("David")
                .setEmail("david@example.com")
                .setPhoneNumber("1234567890")
                .build();

        // Template Method
        BookOperation issueOperation = new IssueBookOperation();
        issueOperation.process();

        BookOperation returnOperation = new ReturnBookOperation();
        returnOperation.process();

        // Iterator
        BookCollection collection = new BookCollection();
        collection.addBook(book1);
        collection.addBook(book2);
        for (Book b : collection) {
            System.out.println("Book in collection: " + b.getTitle());
        }
    }
}
