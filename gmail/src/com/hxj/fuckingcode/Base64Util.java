package com.hxj.fuckingcode;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {
	/**
     * @param bytes
     * @return
     */
    public static byte[] decode(final byte[] bytes) {
        return Base64.decodeBase64(bytes);
    }

    /**
     * ���������ݱ���ΪBASE64�ַ���
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String encode(final byte[] bytes) {
        return new String(Base64.encodeBase64(bytes));
    }

}
