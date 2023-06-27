package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Model.Customer;
import Model.Seller;

public class CustomerDao {
	public static void insertSeller(Customer s) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql="insert into customer(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setLong(2,s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setString(5, s.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Customer customerLogin(Customer s) {
		Customer s1 = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql="select * from customer where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s1 = new Customer();
				s1.setId(rs.getInt("cid"));
				s1.setName(rs.getString("name"));
				s1.setContact(rs.getLong("contact"));
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1;
	}
	public static boolean checkemail(String email) {
		boolean flag= false;
		try {
			Connection con=DBConnection.createConnection();
			String sql="select * from customer where email=?";
			PreparedStatement prt=con.prepareStatement(sql);
			prt.setString(1, email);
			ResultSet rs=prt.executeQuery();
			if(rs.next()) {
				flag=true;
				
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
		return flag;
	}
	public static void updateprofile(Customer c) {
		try {
			Connection con=DBConnection.createConnection();
			String sql="update  customer  set name=?,email=?,address=?,contact=? where id=?";
			PreparedStatement prt=con.prepareStatement(sql);
			prt.setString(1, c.getName());
			prt.setLong(2, c.getContact());
			prt.setString(3, c.getAddress());
			prt.setString(4, c.getEmail());
			
//			prt.setString(3, s.getPassword());
			
			
			prt.setInt(5, c.getId());
			prt.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static boolean checkoldpassword(String op, int id) {
		boolean flag=false;
		try {
			Connection con=DBConnection.createConnection();
			String sql="select * from customer where password=? and id=?";
			PreparedStatement prt=con.prepareStatement(sql);
			prt.setString(1,op);
			prt.setInt(2, id);
			ResultSet rs= prt.executeQuery();
			if(rs.next()) {
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return flag;
		
	}

	public static void updatepassword(String np, int id) {
		
      try {
    		Connection con=DBConnection.createConnection();
			String sql="update customer set password=? where  id=?";
			PreparedStatement prt=con.prepareStatement(sql);
			prt.setString(1,np);
			prt.setInt(2, id);
			prt.executeUpdate();
			System.out.println("data inserted");
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}

	public static void updatePassword(String email, String np) {
		try {
			Connection con = DBConnection.createConnection();
			String sql="update customer set password=? where email=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		public static List<Customer> getAllCustomer(){
			List<Customer> list = new ArrayList<Customer>();
			try {
				Connection conn = DBConnection.createConnection();
				String sql="select * from customer";
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					Customer c1 = new Customer();
					c1.setId(rs.getInt("id"));
					c1.setName(rs.getString("name"));
					c1.setContact(rs.getLong("contact"));
					c1.setAddress(rs.getString("address"));
					c1.setEmail(rs.getString("email"));
					c1.setPassword(rs.getString("password"));
					list.add(c1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
		public static Customer getCustomerById(int id) {
			Customer c1 = null;
			try {
				Connection conn = DBConnection.createConnection();
				String sql="select * from customer where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					c1 = new Customer();
					c1.setId(rs.getInt("id"));
					c1.setName(rs.getString("name"));
					c1.setContact(rs.getLong("contact"));
					c1.setAddress(rs.getString("address"));
					c1.setEmail(rs.getString("email"));
					c1.setPassword(rs.getString("password"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return c1;
		}
		public static void deleteSeller(int id) {
			try {
				Connection conn = DBConnection.createConnection();
				String sql="delete from customer where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.executeUpdate();
				System.out.println("data deleted");
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
}
