package iddfs;

import graph.BasicDirectedGraph;
import graph.DirectedEdge;
import graph.Vertex;
import interfaces.Algorithm;

public class IterativeDeepeningDepthFirstSearch<V extends Vertex, E extends DirectedEdge<V>> implements Algorithm {

    private BasicDirectedGraph<V, E> graph;

    public IterativeDeepeningDepthFirstSearch(BasicDirectedGraph<V, E> graph) {
        this.graph = graph;
    }

    @Override
    public void doTheJob() {
        graph.vertices().forEach(vertex -> System.out.println(vertex.name() + " : " + vertex.weight()));
        graph.edges().forEach(edge -> System.out.println(edge.name() + " : " + edge.weight()));

        //todo - algorithm implementation
    }
}
