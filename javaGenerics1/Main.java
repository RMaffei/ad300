public class Main {
    public static void main(String[] args) {
        // storage class
        Storage<Integer> intStorage = new Storage<>();
        intStorage.setContent(123);
        intStorage.printContent();
        Storage.printStorageWithWildcard(intStorage);
        Storage<String> strStorage = new Storage<>();
        strStorage.setContent("Tbese are my generics");
        strStorage.printContent();
        Storage.printStorageWithWildcard(strStorage);
        NumberStorage<Integer> intNumberStorage = new NumberStorage<>();
        intNumberStorage.setContent(456);
        intNumberStorage.printContent();
        NumberStorage<Double> doubleNumberStorage = new NumberStorage<>();
        doubleNumberStorage.setContent(789.0);
        doubleNumberStorage.printContent();

        // test reverser
        Reverser reverser = new Reverser();
        System.out.println("Reversed: " + reverser.process("Backwards"));

        // test ;library class
        Library<LibraryItem> library = new Library<>();
        library.addItem(new Book("Hackers"));
        library.addItem(new Book("Lord of the Rings"));
        library.addItem(new DVD("Inception"));
        library.addItem(new DVD("The Matrix"));

        System.out.println("Library Stock:");
        library.listItems();

        LibraryItem foundItem = library.findItemByName("Hackers");
        if (foundItem != null) {
            System.out.println("Found: " + foundItem.getName());
            foundItem.borrowItem();
        }

        System.out.println("Stock after checking out 'Hackers':");
        library.listItems();

        if (foundItem != null) {
            foundItem.returnItem();
        }

        System.out.println("Stock after returning 'Hackers':");
        library.listItems();
    }
}