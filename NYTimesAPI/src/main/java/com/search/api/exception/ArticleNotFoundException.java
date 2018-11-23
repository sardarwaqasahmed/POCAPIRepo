package com.search.api.exception;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
public class ArticleNotFoundException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -1616972746852282769L;

    public ArticleNotFoundException(String articleId) {
        super("Article not found with id " + articleId);
    }
}
