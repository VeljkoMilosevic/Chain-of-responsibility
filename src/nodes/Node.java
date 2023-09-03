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
public abstract class Node {

    protected Node nextNode;

    public abstract Map<String, Integer> handleRequest(int insertAmount, Map<String, Integer> nodeMap);

}
