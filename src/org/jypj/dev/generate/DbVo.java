/**
 * 25 Aug 2016
 */
package org.jypj.dev.generate;

import com.google.gson.Gson;

/**
 * @author ChenYu 数据库表结构对象
 */
public class DbVo {

	/**
	 * 表名
	 */
	private String tableName;
	/**
	 * 列名
	 */
	private String columnName;
	/**
	 * 数据类型
	 */
	private String dataType;
	/**
	 * 注释
	 */
	private String comments;
	/**
	 * 是否是主键
	 */
	private String isPrimaryKey;

	public String getTableName() {
		return tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getIsPrimaryKey() {
		return isPrimaryKey;
	}

	public void setIsPrimaryKey(String isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}

	@Override
	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

}
