package gen.mapper;

import gen.domain.MenuInfo;
import gen.domain.MenuInfoExample;
import java.util.List;

public interface MenuInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated
     */
    int insert(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated
     */
    int insertSelective(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated
     */
    List<MenuInfo> selectByExample(MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated
     */
    MenuInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MenuInfo record);
}