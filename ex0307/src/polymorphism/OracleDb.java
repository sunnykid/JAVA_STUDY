package polymorphism;

public class OracleDb implements DataControl {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB 읽음");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB 삽입");

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB 지움");

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB 갱신");

	}

}
