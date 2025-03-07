package polymorphism;

public class DbManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDb());
		dbWork(new MariaDb());
	}

	public static void dbWork(DataControl dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
}
