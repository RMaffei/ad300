class Storage<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void printContent() {
        System.out.println("Storage content: " + content);
    }

    public static void printStorageWithWildcard(Storage<?> storage) {
        System.out.println("Storage content including wildcard: " + storage.getContent());
    }
}