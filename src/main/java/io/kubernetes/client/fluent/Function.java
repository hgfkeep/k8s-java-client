package io.kubernetes.client.fluent;


public interface Function<I,O>{


    O apply(I item);



}
