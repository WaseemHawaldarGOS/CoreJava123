package com.gos.behavioral.visitorpattern;

public interface Visitor {
	
	public void visit(This e); // second dispatch
	   public void visit(That e);
	   public void visit(TheOther e);
	}
