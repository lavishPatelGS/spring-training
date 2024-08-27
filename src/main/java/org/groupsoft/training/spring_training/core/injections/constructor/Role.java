package org.groupsoft.training.spring_training.core.injections.constructor;

public class Role {

	private String roleId;
	private String roleName;
	private boolean isActive;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String roleId, String roleName, boolean isActive) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.isActive = isActive;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", isActive=" + isActive + "]";
	}

}
