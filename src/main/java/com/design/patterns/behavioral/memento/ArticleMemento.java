package com.design.patterns.behavioral.memento;

/**
 * @author sumit
 * Behavioral Design Patterns
 * Memento design pattern is used when we want to save the state of an object so that we can restore later on.
 */
public final class ArticleMemento {
    private final long id;
    private final String title;
    private final String content;

    public ArticleMemento(long id, String title, String content) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
