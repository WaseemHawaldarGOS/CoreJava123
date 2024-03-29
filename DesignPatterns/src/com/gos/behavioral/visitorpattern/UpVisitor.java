package com.gos.behavioral.visitorpattern;

public class UpVisitor implements Visitor {

	@Override
	public void visit(This e) {
		  System.out.println( "do Up on " + e.thiss() );

	}

	@Override
	public void visit(That e) {
		System.out.println( "do Up on " + e.that() );

	}

	@Override
	public void visit(TheOther e) {
		 System.out.println( "do Up on " + e.theOther() );

	}

}
