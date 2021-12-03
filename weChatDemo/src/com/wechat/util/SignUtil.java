package com.wechat.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 对接工具类
 * @author @长大没几天
 * <br>2016年11月10日<br>下午4:22:41
 */
public class SignUtil {

		// 设置你的 token ，即微信服务器和个人服务器对接时需要的一把钥匙，以防止第三方恶意调用
	    // token 可随便填写，但微信服务器上填写的 token 和个人服务器上填写的 token 必须一致
		private static String token = "tokenissummer";

		/* 以下方法微信公众平台提供 */
		public static boolean checkSignature(String signature, String timestamp,String nonce) {

			String[] arr = new String[] { token, timestamp, nonce };

			sort(arr);
			StringBuilder content = new StringBuilder();
			for (int i = 0; i < arr.length; i++) 
				content.append(arr[i]);

			MessageDigest md = null;
			String tmpStr = null;

			try {
				md = MessageDigest.getInstance("SHA-1");
				byte[] digest = md.digest(content.toString().getBytes());
				tmpStr = byteToStr(digest);
			} 
			catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}

			content = null;
			return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;

		}

		private static String byteToStr(byte[] byteArray) {

			String strDigest = "";
			for (int i = 0; i < byteArray.length; i++) 
				strDigest += byteToHexStr(byteArray[i]);
			return strDigest;

		}

		private static String byteToHexStr(byte mByte) {

			char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
			char[] tempArr = new char[2];
			tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
			tempArr[1] = Digit[mByte & 0X0F];

			String s = new String(tempArr);
			return s;
		}

		public static void sort(String a[]) {

			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j].compareTo(a[i]) < 0) {
						String temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
}
