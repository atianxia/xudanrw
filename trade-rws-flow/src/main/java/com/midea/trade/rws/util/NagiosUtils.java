package com.midea.trade.rws.util;


public class NagiosUtils {
	public static final String KEY_DB_NOT_AVAILABLE = "DB_NOT_AVAILABLE"; //数据库不可用,KEY前缀+dbindex
	

	public static void addNagiosLog(String key, String value) {
		key = key.replaceAll(":", "_");
		key = key.replaceAll(",", "|");
		value = value.replaceAll(":", "_");
		value = value.replaceAll(",", "|");
		innerAddNagiosLog(key, value);
	}

	public static void addNagiosLog(String key, int value) {
		key = key.replaceAll(":", "_");
		key = key.replaceAll(",", "|");
		innerAddNagiosLog(key, Integer.toString(value));
	}

	public static void addNagiosLog(String key, long value) {
		key = key.replaceAll(":", "_");
		key = key.replaceAll(",", "|");
		innerAddNagiosLog(key, Long.toString(value));
	}

	public static void addNagiosLog(String host, String key, String value) {
		host = host.replaceAll(":", "_");
		host = host.replaceAll(",", "|");
		key = key.replaceAll(":", "_");
		key = key.replaceAll(",", "|");
		value = value.replaceAll(":", "_");
		value = value.replaceAll(",", "|");
		innerAddNagiosLog(host, key, value);
	}

	public static void addNagiosLog(String host, String key, int value) {
		host = host.replaceAll(":", "_");
		host = host.replaceAll(",", "|");
		key = key.replaceAll(":", "_");
		key = key.replaceAll(",", "|");
		innerAddNagiosLog(host, key, Integer.toString(value));
	}

	public static void addNagiosLog(String host, String key, long value) {
		host = host.replaceAll(":", "_");
		host = host.replaceAll(",", "|");
		key = key.replaceAll(":", "_");
		key = key.replaceAll(",", "|");
		innerAddNagiosLog(host, key, Long.toString(value));
	}

	private static void innerAddNagiosLog(String key, String value) {
		StringBuilder sb = new StringBuilder();
		sb.append(key);
		sb.append(":");
		sb.append(value);
		//nagiosLog.info(sb.toString());
	}

	private static void innerAddNagiosLog(String host, String key, String value) {
		StringBuilder sb = new StringBuilder();
		sb.append(host);
		sb.append("_");
		sb.append(key);
		sb.append(":");
		sb.append(value);
		//nagiosLog.info(sb.toString());
	}
}