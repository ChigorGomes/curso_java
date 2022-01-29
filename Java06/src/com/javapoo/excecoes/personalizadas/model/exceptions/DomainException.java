package com.javapoo.excecoes.personalizadas.model.exceptions;

import java.io.Serial;

//runtime : o compilador não obriga a tratar
// Exception: o compilador obriga a tratar try/catch
public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg); //passa para o construtor da superclasse
    }
}
