/**
 * 12 Sep 2016
 */
package org.jypj.dev.generate;

import java.util.Map;

/**
 * @author ChenYu
 *
 */
public class Table {

	/**
	 * 前缀
	 */
	private String prefix;
	/**
	 * 后缀
	 */
	private String suffix;
	/**
	 * 由map中得到的tableNames
	 */
	private String tableNames;
	/**
	 * 表名与实体类名的映射
	 */
	private Map<String, String> map;

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public String getTableNames() {
		return tableNames;
	}

	public void setTableNames(String tableNames) {
		this.tableNames = tableNames;
	}

	@Override
	public String toString() {
		return "Table [prefix=" + prefix + ", suffix=" + suffix + ", tableNames=" + tableNames + ", map=" + map + "]";
	}

	
}
