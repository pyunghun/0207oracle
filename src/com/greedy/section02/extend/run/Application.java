package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrunkenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;

public class Application {

	public static void main(String[] args) {

//		RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//		RabbitFarm<Mammal> farm1 = new RabbitFarm<>();
//		RabbitFarm<Snake> farm1 = new RabbitFarm<>();
		
		/* Rabbit 타입이나 Rabbit 타입의 후손으로 타입변수를 설정해야 인스턴스를 생성할 수 있다. */
		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
		
//		farm3.setAnimal(new Snake); -- DrunkenBunny 만 들어갈 수 있도록 하였다.
		farm1.setAnimal(new Rabbit()); //1번
		/* (Rabbit) */farm1.getAnimal().cry(); // -지금 타입이 Rabbit 이기 떄문에 ()이 빈칸이여도 가능하다. 이 타입은 <> Rabbit 클래스에 설정되어있음
		farm1.getAnimal().cry(); // 이미 Rabbit이 보장 되어 있어 형변환을 쓸 필요가 없다.
		
		farm2.setAnimal(new Bunny());
		farm2.getAnimal().cry();
		
		farm3.setAnimal(new DrunkenBunny());
		farm3.getAnimal().cry();
		
	}

}
