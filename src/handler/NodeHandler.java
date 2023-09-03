package handler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import nodes.Node100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Veljko
 */
public class NodeHandler {

    public Map<String, Integer> handle(final int amount) {
        Map<String, Integer> banknoteChain = new HashMap<>();
        banknoteChain = new Node100().handleRequest(amount, banknoteChain);
        return banknoteChain;
    }
}
