package com.couchbase.client.java.customConverter;

import com.couchbase.client.core.message.ResponseStatus;
import com.couchbase.client.java.document.AbstractDocument;
/**
 * Custom document class for BinaryTest
 *
 * @author David Sondermann
 * @since 2.0
 */
public class StringDocument extends AbstractDocument<String>
{

  public static StringDocument create(final String id, final String content) {
    return new StringDocument(id, content, 0, 0, null);
  }

  public static StringDocument create(final String id, final String content, final long cas, final int expiry, final ResponseStatus status)
	{
		return new StringDocument(id, content, cas, expiry, status);
	}

  private StringDocument(String id, String content, long cas, int expiry, ResponseStatus status) {
    super(id, content, cas, expiry, status);
  }
}
