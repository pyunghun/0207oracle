package com.greedy.section02.extend;

public class WildCardFarm {
	
	/* 토끼농장에 있는 토끼가 어떤 토끼이던 상관 없다  <?>*/
	public void anyType(RabbitFarm<?>farm) {
		farm.getAnimal().cry();
	}
	
	/* 토끼농장의 토끼는 바니 이거나 그 후손 타입으로 만들어지 토끼 농장만 매개변수로 사용 가능 <? extends Type>*/
	public void extendsType(RabbitFarm<? extends Bunny> farm) {
		farm.getAnimal().cry();
	}
	
	/* 토끼농장의 토끼는 Bunny 이거나 그 부모 타입으로 만들어진 토끼농장만 매개변수로 사용 가능 
	 * 안녕핫게ㅇ*/
	public void superType(RabbitFarm<? super Bunny> farm) {
		farm.getAnimal().cry();
	}
	
}
