package gen.mapper;

import gen.domain.RoleInfo;
import gen.domain.RoleInfoExample;
import java.util.List;

public interface RoleInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_info
     *
     * @mbg.generated
     */
    int insert(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_info
     *
     * @mbg.generated
     */
    int insertSelective(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_info
     *
     * @mbg.generated
     */
    List<RoleInfo> selectByExample(RoleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_info
     *
     * @mbg.generated
     */
    RoleInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RoleInfo record);
}