package studentinfo.service.implemetation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import studentinfo.dbconnection.DBconnection;
import studentinfo.entity.Student;
import studentinfo.service.Service;

public class ServiceImplementation implements Service {
	DBconnection dbconnection = new DBconnection();

	@Override
	public boolean checkLogin(String user, String pass) {
		String CHECK_LOGIN = "SELECT * FROM admin WHERE username=? AND password=?";
		Connection conn = dbconnection.getConnection();
		boolean isLogin = false;
		try {
			PreparedStatement statement = conn.prepareStatement(CHECK_LOGIN);
			statement.setString(1, user);
			statement.setString(2, pass);
			ResultSet result = statement.executeQuery();
			isLogin = result.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isLogin;
	}

	@Override
	public void addStudent(Student student) {
		String ADD_STUDENT = "INSERT INTO studentinfo(name, email,address,roll,birthdate) VALUES(?,?,?,?,?)";
		Connection connection = dbconnection.getConnection();
		try {
//			,Statement.RETURN_GENERATED_KEYS use this after ADD_STUDENT below 
			PreparedStatement statement = connection.prepareStatement(ADD_STUDENT);
			statement.setString(1, student.getName());
			statement.setString(2, student.getEmail());
			statement.setString(3, student.getAddress());
			statement.setInt(4, student.getRollno());
			statement.setString(5, student.getDate());
			statement.execute();

			// Retrieve the auto-incremented primary key value (id)
//		        ResultSet generatedKeys = statement.getGeneratedKeys();
//		        if (generatedKeys.next()) {
//		            int generatedId = generatedKeys.getInt(1);
//		            student.setId(generatedId); 
//		        }
//		        generatedKeys.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Student> getAllStudent() {
		String STUDENT_INFO = "SELECT * FROM studentinfo";
		List<Student> students = new ArrayList<>();
		Connection connection = dbconnection.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(STUDENT_INFO);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Integer ids = result.getInt("id");
				String name = result.getString("name");
				String email = result.getString("email");
				String address = result.getString("address");
				Integer roll = result.getInt("roll");
				String birthdate = result.getString("birthdate");
				students.add(new Student(ids, name, email, address, roll, birthdate));
			}
			result.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return students;
	}

	@Override
	public Student getStudent(Integer id) {
		String STUDENT = "SELECT * FROM studentinfo WHERE id=?";
		Student student = new Student();
		Connection connection = dbconnection.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(STUDENT);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				student.setId(result.getInt("id"));
				student.setName(result.getString("name"));
				student.setEmail(result.getString("email"));
				student.setAddress(result.getString("address"));
				student.setRollno(result.getInt("roll"));
				student.setDate(result.getString("birthdate"));
			}
			result.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	public String updateStudent(Student student) {
		Connection connection = dbconnection.getConnection();
		String UPDATE = "UPDATE studentinfo SET name=?,email=?,address=?,roll=?,birthdate=? WHERE id=?";
		try {
			PreparedStatement statement = connection.prepareStatement(UPDATE);
			statement.setString(1, student.getName());
			statement.setString(2, student.getEmail());
			statement.setString(3, student.getAddress());
			statement.setInt(4,student.getRollno());
			statement.setString(5, student.getDate());
			statement.setInt(6, student.getId());
			statement.execute();
			return "success";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "went wrong";
		}

	}
	public String deleteStudent(Integer id) {
		Connection connection = dbconnection.getConnection();
		String DELETE ="DELETE FROM studentinfo WHERE id=?";
		try {
			PreparedStatement statement= connection.prepareStatement(DELETE);
			statement.setInt(1, id);
			statement.execute();
			return "successfull";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Somthing went wring";
		}
	}
}
