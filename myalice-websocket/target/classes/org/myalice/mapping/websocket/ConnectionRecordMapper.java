package org.myalice.mapping.websocket;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.myalice.domain.websocket.ConnectionRecord;

public interface ConnectionRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table connection_record
     *
     * @mbg.generated
     */
    @Delete({
        "delete from connection_record",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table connection_record
     *
     * @mbg.generated
     */
    @Insert({
        "insert into connection_record (id, client_address, ",
        "server_address, type, ",
        "status, user_id, open_time, ",
        "close_time)",
        "values (#{id,jdbcType=VARCHAR}, #{clientAddress,jdbcType=VARCHAR}, ",
        "#{serverAddress,jdbcType=VARCHAR}, #{type,jdbcType=CHAR}, ",
        "#{status,jdbcType=CHAR}, #{userId,jdbcType=VARCHAR}, #{openTime,jdbcType=TIMESTAMP}, ",
        "#{closeTime,jdbcType=TIMESTAMP})"
    })
    int insert(ConnectionRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table connection_record
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, client_address, server_address, type, status, user_id, open_time, close_time",
        "from connection_record",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="client_address", property="clientAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="server_address", property="serverAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="open_time", property="openTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="close_time", property="closeTime", jdbcType=JdbcType.TIMESTAMP)
    })
    ConnectionRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table connection_record
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, client_address, server_address, type, status, user_id, open_time, close_time",
        "from connection_record"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="client_address", property="clientAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="server_address", property="serverAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="open_time", property="openTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="close_time", property="closeTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ConnectionRecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table connection_record
     *
     * @mbg.generated
     */
    @Update({
        "update connection_record",
        "set client_address = #{clientAddress,jdbcType=VARCHAR},",
          "server_address = #{serverAddress,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "user_id = #{userId,jdbcType=VARCHAR},",
          "open_time = #{openTime,jdbcType=TIMESTAMP},",
          "close_time = #{closeTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ConnectionRecord record);
}