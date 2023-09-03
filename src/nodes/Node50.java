/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodes;

import java.util.Map;

/**
 * @author Veljko
 */
public class Node50 extends Node {

    public Node50() {
        this.nextNode = new Node10();
    }

    @Override
    public Map<String, Integer> handleRequest(final int insertAmount, final Map<String, Integer> banknoteChain) {
        banknoteChain.put("50", insertAmount / 50);
        return nextNode.handleRequest(insertAmount % 50, banknoteChain);
    }
}
