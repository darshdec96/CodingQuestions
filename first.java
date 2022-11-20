package com;

public interface first {
	void disp();
	default void show() {
		System.out.println("default");
	}

}
