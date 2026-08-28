/**
 * Memento Pattern Demo
 *
 * Intent: Capture an object's internal state into an external snapshot (memento) so it can
 * be restored later, without exposing the object's internal structure to the outside world.
 *
 * How it works here:
 *   - Article is the originator — it knows how to create and restore its own memento.
 *   - ArticleMemento is the immutable snapshot — it stores only the 'content' field
 *     (id and title are fixed; only content is mutable and worth saving).
 *   - createMemento() captures the current content into an ArticleMemento.
 *   - restore(memento) rolls the content back to the saved value — the undo operation.
 *   - The caretaker (this main method) holds the memento but cannot read or modify its
 *     internals — encapsulation of Article's state is preserved.
 *
 * Real-world use cases: text editor undo, transaction rollback, game save-points.
 *
 * @author sumit
 */

package com.design.patterns.behavioral.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MementoDemo {

    final static Logger log = LoggerFactory.getLogger(MementoDemo.class);

    public static void main(String[] args) {
        Article article = new Article(1, "My Article");
        article.setContent("ABC"); // set initial content
        log.info(String.valueOf(article));

        // Snapshot: captures current content "ABC" into an immutable memento
        ArticleMemento memento = article.createMemento();

        article.setContent("123"); // content changed — this is the "bad edit" to undo
        log.info(String.valueOf(article));

        // Undo: restore rolls article content back to "ABC" from the memento
        article.restore(memento);
        log.info(String.valueOf(article)); // back to original content "ABC"
    }
}
