package JungleBook;

public class Game {

	public static void main(String[] args) {
		
		Bear b=new Bear();
		b.name="Baloo";
		b.drink();
		b.eat();
		b.sleep();
		b.honeyDrink();
		
		Human h=new Human();
		h.name="mogli";
		h.talk();
		h.eat();
		h.sleep();
		h.drink();
		h.think();
		h.walk();
		
		Tiger t=new Tiger();
		t.name="sherkhan";
		t.hunt();
		t.walk();
		t.sleep();
		t.roar();
		t.eat();
		t.drink();
		
		Wolf w=new Wolf();
		w.name="akela";
		w.hunt();
		w.walk();
		w.sleep();
		w.eat();
		w.drink();
		w.drink();
		w.drink();
		
		Snake s=new Snake();
		s.name="ka";
		s.sleep();
		s.bite();
		s.eat();
		s.drink();
		
	}
}
