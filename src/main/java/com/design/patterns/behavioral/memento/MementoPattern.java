package com.design.patterns.behavioral.memento;


import java.util.logging.Logger;

/**
 * @author sumit
 * Behavioral Design Patterns
 * Memento design pattern is used when we want to save the state of an object so that we can restore later on.
 */
public class MementoPattern {

    final static Logger log = Logger.getLogger(MementoPattern.class.getName());

    public static void main(String[] args) {
        Article article = new Article(1, "My Article");
        article.setContent("ABC");      //original content
        log.info(article.toString());
        ArticleMemento memento = article.createMemento();   //created immutable memento
        article.setContent("123");      //changed content
        log.info(article.toString());
        article.restore(memento);       //UNDO change
        log.info(article.toString());   //original content
    }
}
