package com.couchbase.client.java.customConverter;

import com.couchbase.client.core.message.ResponseStatus;
import com.couchbase.client.java.convert.Converter;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

/**
 * Custom converter class for BinaryTest
 *
 * @author David Sondermann
 * @since 2.0
 */
public class StringJsonConverter implements Converter<StringDocument, String>
{

	@Override
	public String decode(final ByteBuf buffer)
	{
		return buffer.toString(CharsetUtil.UTF_8);
	}

	@Override
	public ByteBuf encode(final String content)
	{
		return Unpooled.copiedBuffer(content, CharsetUtil.UTF_8);
	}

	@Override
	public StringDocument newDocument(final String id, final String content, final long cas, final int expiry, final ResponseStatus status)
	{
		return StringDocument.create(id, content, cas, expiry, status);
	}

}
