package Day_13;

import java.sql.SQLException;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question_1 sc = new Question_1(1,"aman",410);
		try {
			sc.update();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
