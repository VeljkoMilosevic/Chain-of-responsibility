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
public class Node100 extends Node {

    public Node100() {
        this.nextNode = new Node50();
    }

    @Override
    public Map<String, Integer> handleRequest(final int insertAmount, final Map<String, Integer> nodeMap) {
        nodeMap.put("100", insertAmount / 100);
        return nextNode.handleRequest(insertAmount % 100, nodeMap);
    }
}
