package Task1;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Click 1 to Insert l :");
		System.out.println("Click 2 to Update Data :");
		System.out.println("Click 3 to delete Data :");
		System.out.println("Click 4 to Read  Data :");
		int no = sc.nextInt();

		switch (no) {

		case 1:
			Insert r = new Insert();
			r.insert();
			break;
		case 2:
			Update u = new Update();
			u.update();
			break;
		case 3:
			Delete d = new Delete();
			d.delete();
			break;
		case 4:
			Read a = new Read();
			a.alldata();
			break;

		default:
			System.out.println("Enter no between 1 to 4");
		}

	}
}
