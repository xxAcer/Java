package cn.prince.pojo;

public class Menu {
	private int menuId;
	private String menuName;
	private int pMenuId;
	/**
	 * @return the menuId
	 */
	public int getMenuId() {
		return menuId;
	}
	/**
	 * @param menuId the menuId to set
	 */
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	/**
	 * @return the menuName
	 */
	public String getMenuName() {
		return menuName;
	}
	/**
	 * @param menuName the menuName to set
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * @return the pMenuId
	 */
	public int getpMenuId() {
		return pMenuId;
	}
	/**
	 * @param pMenuId the pMenuId to set
	 */
	public void setpMenuId(int pMenuId) {
		this.pMenuId = pMenuId;
	}
	public Menu(int menuId, String menuName, int pMenuId) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.pMenuId = pMenuId;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
