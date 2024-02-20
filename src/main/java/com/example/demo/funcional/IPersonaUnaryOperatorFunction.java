package com.example.demo.funcional;

@FunctionalInterface
public interface IPersonaUnaryOperatorFunction <T> {

	public T aplicar (T arg);
}
