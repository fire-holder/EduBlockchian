package edu.uno.blockchain.form;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/*
 * The class for transaction object.
 */
@EntityScan
public class Tokenform {
    private int id;
    private String token;

    /*
     * Default constructor
     */
    public Tokenform() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Tokenform(int id, String token) {
        this.id = id;
        this.token = token;
    }

}