package com.example.shiro_mysql_integrate.mapper;

import java.util.Set;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface RoleMapper {

  // SELECT p.name
  // FROM permission p
  // INNER JOIN role_permission rp
  // ON rp.permission_id = p.on
  // WHERE rp.role_id = #{role_id}
  @Select("SELECT p.name" +
      "FROM permission p" +
      "INNER JOIN role_permission rp" +
      "ON rp.permission_id = p.on" +
      "WHERE rp.role_id = #{role_id}")
  Set<String> getPermissionByRoleId(@Param("role_id") Long roleId);

}
