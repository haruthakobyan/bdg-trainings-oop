package com.bdg.bookstorage.spapoyan.service;

import com.bdg.bookstorage.spapoyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.spapoyan.entitys.Author;

public class AuthorServiceImpl implements AuthorService {

    @Override
    public Author get() {
        return null;
    }

    @Override
    public Author create(AuthorCreateParameter authorCreateParameter) {

        AuthorCreateParameter author = new AuthorCreateParameter(authorCreateParameter.getName(),authorCreateParameter.getSurname(), authorCreateParameter.getGender());

        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}