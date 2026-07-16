public class App {
	public static void main(String[] args){

		Pet p1 = new Pet("新野孝一郎");

		p1.selfIntoro();

		p1.feed();
		p1.play();
		p1.rest();
		p1.work();
		p1.observeNormal();
		p1.work();

		Pet p2 = new Pet("はやと");

		p2.selfIntoro();

		p2.feed();
		p2.play();
		p2.rest();
		p2.work();
		p2.observeSleep();
		p2.work();

		Pet p3 = new Pet("じゅんのすけ");
		p3.selfIntoro();

		p3.feed();
		p3.play();
		p3.rest();
		p3.work();
		p3.observeEnergy();
		p3.work();

		Pet p4 = new Pet("はくた");

		p4.selfIntoro();

		p4.feed();
		p4.play();
		p4.rest();
		p4.work();
		p4.observeHungry();
		p4.work();

	}

}
