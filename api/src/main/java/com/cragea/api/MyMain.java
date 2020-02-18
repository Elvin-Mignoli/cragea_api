/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cragea.api;

import br.com.andrewribeiro.ribrest.Ribrest;

/**
 *
 * @author elvin.silva
 */
public class MyMain {
    
    public static void main (String args[]){
    	Ribrest.getInstance()
		    	.appBaseUrl("http://localhost:2007")
		    	.appName("myapp")
		    	.persistenceUnitName("myunit")
		    	.init();
	}
}
