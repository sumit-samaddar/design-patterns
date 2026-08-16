/**
 * @author sumit
 * Captures and restores object state without violating encapsulation.
 */

package com.design.patterns.behavioral.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MementoDemo {

    final static Logger log = LoggerFactory.getLogger(MementoDemo.class);

    public static void main(String[] args) {
        Article article = new Article(1, "My Article");
        article.setContent("ABC");      //original content
        log.info(String.valueOf(article));

        ArticleMemento memento = article.createMemento();   //created immutable memento

        article.setContent("123");      //changed content
        log.info(String.valueOf(article));

        article.restore(memento);       //UNDO change
        log.info(String.valueOf(article));              //original content
    }
}
