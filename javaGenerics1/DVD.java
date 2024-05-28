class DVD implements LibraryItem {
    private final String title;
    private boolean available = true;

    public DVD(String title) {
        this.title = title;
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrowItem() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    @Override
    public void returnItem() {
        available = true;
        System.out.println(title + " returned.");
    }

    @Override
    public String toString() {
        return title + (available ? " (Available)" : " (Borrowed)");
    }
}