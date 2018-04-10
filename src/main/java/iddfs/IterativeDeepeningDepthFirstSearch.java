package iddfs;

import graph.BasicDirectedGraph;
import graph.DirectedEdge;
import graph.Vertex;
import interfaces.Algorithm;

public class IterativeDeepeningDepthFirstSearch<V extends Vertex, E extends DirectedEdge<V>> extends Algorithm {

    private BasicDirectedGraph<V, E> graph;

    public IterativeDeepeningDepthFirstSearch(BasicDirectedGraph<V, E> graph, boolean isParallel) {
        this.graph = graph;
        this.isParallel = isParallel;
    }

    @Override
    public void doTheJob() {
        graph.vertices().forEach(vertex -> System.out.println(vertex.name() + " : " + vertex.weight()));
        graph.edges().forEach(edge -> System.out.println(edge.name() + " : " + edge.weight()));
        System.out.println("Parallel Mode: " + this.isParallel);

        //todo - algorithm implementation
        if (isParallel){

            //todo - parallel implementation goes here

        } else {

            //todo - sequential implementation goes here

        }
    }
}