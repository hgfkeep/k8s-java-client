package io.kubernetes.client.fluent;


public interface Visitable<T>{


    T accept(io.kubernetes.client.fluent.Visitor visitor);



}
