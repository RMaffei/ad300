interface LibraryItem {
    String getName();
    boolean isAvailable();
    void borrowItem();
    void returnItem();
}