package cn.prince.pojo;

public class User {
	private int userid;
	private String username;
	private String password;
	
	public User(int userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the id
	 */
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
}
