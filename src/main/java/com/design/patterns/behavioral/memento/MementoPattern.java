package com.design.patterns.behavioral.memento;

import com.design.patterns.behavioral.iterator.IteratorPattern;
import org.apache.log4j.Logger;

public class MementoPattern {

    final static Logger log = Logger.getLogger(IteratorPattern.class);

    public static void main(String[] args) {
        Article article = new Article(1, "My Article");
        article.setContent("ABC");      //original content
        log.info(article);

        ArticleMemento memento = article.createMemento();   //created immutable memento

        article.setContent("123");      //changed content
        log.info(article);

        article.restore(memento);       //UNDO change
        log.info(article);              //original content
    }
}
