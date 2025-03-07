package polymorphism;

public class MariaDb implements DataControl {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("마리아 DB 읽음");

	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("마리아 DB 삽입");

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("마리아 DB 지움");

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("마리아 DB 갱신");

	}

}
