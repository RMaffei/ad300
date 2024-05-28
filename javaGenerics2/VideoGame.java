class VideoGame implements Game {
    private final String title;
    private final String developer;
    private boolean available = true;

    public VideoGame(String title, String developer) {
        this.title = title;
        this.developer = developer;
    }

    @Override
    public String getName() {
        return title;
    }

    public String getDeveloper() {
        return developer;
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
        return title + " by " + developer + (available ? " (Available)" : " (Borrowed)");
    }
}