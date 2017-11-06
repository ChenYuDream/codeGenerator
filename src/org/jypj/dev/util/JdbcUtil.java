package org.jypj.dev.util;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jypj.dev.generate.Config;

/**
 * 
 * @author chenyu 数据库连接驱动
 */
public class JdbcUtil {

	private Connection conn = null;

	public JdbcUtil(Config config) {

		try {
			Class.forName(config.getDriverClassName());
			this.conn = (Connection) DriverManager.getConnection(config.getJdbcUrl(), config.getUsername(),
					config.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 创建连接实例
	 * 
	 * @return
	 */
	public Connection getConnection() {

		return this.conn;
	}

	/**
	 * 关闭连接
	 */
	public void close() {
		try {
			this.conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
